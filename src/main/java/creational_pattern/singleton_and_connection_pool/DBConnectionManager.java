package creational_pattern.singleton_and_connection_pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * This class demonstrates the combined use of the Singleton pattern and Connection Pooling.
 *
 * - The Singleton pattern ensures that only one instance of a class exists across the application.
 * - Objecting Pooling pattern maintains a set of reusable object for efficiency and control.
 *
 * Why is this useful?
 * - Without pooling, each client-side request may open a new database connection, leading to:
 *   - High overhead due to expensive connection creation.
 *   - Too many open connections, potentially overwhelming the database.
 *   - In a multithreaded system, threads could fight over connections if not managed properly.
 *
 * Connection pooling addresses these issues by reusing a fixed number of connections.
 * Singleton ensures that this shared pool is managed through a single access point.
 *
 * It would be inefficient to allow multiple instances of a resource manager
 * whose entire purpose is to control and limit such resources — hence the need for Singleton.
 */
public class DBConnectionManager {
    // standard JDBC format: jdbc:<subprotocol>:<subname>
    private static final String URL = "jdbc:sqlite:example.DB";
    private final Queue<MyConnection> pool;
    // Static - belongs to the class (only created at one memory addr, even if multiple objects)
    // Volatile - Ensures visibility of the shared instance across all threads
    // By not letting threads cache this value encouraging to update data each time.
    private static volatile DBConnectionManager instance;

    private DBConnectionManager(int allowedConnect) {
        pool = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < allowedConnect; i++) {
            try {
                Connection conn = DriverManager.getConnection(URL);
                pool.add(new MyConnection(i, conn));
            } catch (Exception e) {
                throw new RuntimeException("Connection init failed", e);
            }
        }
    }

    public static DBConnectionManager getInstance(int allowedConnect) {
        if (instance == null) {
            // Ensures only one thread has access to class at a time.
            synchronized (DBConnectionManager.class) {
                return new DBConnectionManager(allowedConnect);
            }
        }

        return instance;
    }

    public MyConnection getConnection() {
        return pool.poll();  // null if empty
    }

    public void releaseConnection(MyConnection conn) {
        if (conn == null) throw new NullPointerException();
        pool.add(conn);
    }
}

