package creational_pattern.singleton_and_connection_pool;

import java.sql.Connection;

public class MyConnection {
    private final int id;
    private final Connection conn;

    MyConnection(int id, Connection conn) {
        this.id = id;
        this.conn = conn;
    }

  public int getId() {
    return id;
  }
}
