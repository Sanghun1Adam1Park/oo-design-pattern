package creational_pattern.factory;

import java.util.List;

public class Dungeon {
  private List<Monster> monsters;
  private MonsterSpawner spawner;

  // Constructor and other logics...

  void createMonsters() {
    for (int i = 0; i < 1000; i++) {
      monsters.add(spawner.spawnMonster());
    }
  }
}
