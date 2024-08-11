package dnd.supers.service;

import dnd.supers.Enemy;
import dnd.supers.service.util.Directions;

public class EnemyService {

    private final Enemy[] enemy;

    public EnemyService(Enemy[] enemy) {
        this.enemy = enemy;
    }

    public void moveEnemies() {
        for (Enemy e : enemy) {
            int cast = 1 + (int) (Math.random() * 4);
            Directions directions = null;
            switch (cast) {
                case 1:
                    directions = Directions.LEFT;
                    break;
                case 2:
                    directions = Directions.RIGHT;
                    break;
                case 3:
                    directions = Directions.UP;
                    break;
                case 4:
                    directions = Directions.DOWN;
                    break;
            }
            assert directions != null;
            move(directions, e);
        }
    }

    private void move(Directions directions, Enemy enemy) {
        switch (directions) {
            case LEFT:
                enemy.setX(enemy.getX() - 1);
                break;
            case RIGHT:
                enemy.setX(enemy.getX() + 1);
                break;
            case UP:
                enemy.setY(enemy.getY() - 1);
                break;
            case DOWN:
                enemy.setY(enemy.getY() + 1);
                break;
        }
    }

    public Enemy[] getEnemy() {
        return enemy;
    }
}
