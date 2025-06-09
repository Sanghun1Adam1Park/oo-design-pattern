package creational_pattern.factory;

/**
 * This class demonstrates the combined use of the Factory pattern.
 *
 * Factory pattern is about creating objects without exposing the logic to the client.
 * - Client refers to the part of the code that uses the factory to create objects,
 *   but does not know or care about the specific class being instantiated.
 *   It relies on a common interface or abstract class and delegates object creation to the factory.
 *
 * Why is it useful?
 * - Hides the creation logic from the client, making the code cleaner and more maintainable.
 * - Promotes reusability since the same factory can be used to create different types of objects.
 * - Encourages extensibility by allowing new product types to be added with minimal changes to existing code.
 * - Helps adhere to the Open/Closed Principle (open for extension, closed for modification).
 *
 * Example, 
 * Say you are building a PvE game where players fight off the monsters. 
 * In Dungeon class (Client in our example), it will be bad practice of SOLID, 
 * if we write everything (from creating environment to spawning monsters). 
 * 
 * That's where factory pattern comes in hand, using Monster spawner as factory,
 * Dungeon class can use spawner to spawn monster. In this way, codes are cleaner,
 * and logics are hid from client. Finally, interface offers exploration of extension.
 */
public class MonsterSpawner {
  public Monster spawnMonster() {
    return new Zombie();
  }
}
