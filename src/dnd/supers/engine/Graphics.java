
package dnd.supers.engine;

import dnd.supers.Enemy;
import dnd.supers.Player;
import dnd.supers.generated.RandomChest;
public class Graphics {

    private final char[][] map = new char[30][30];

    public void render(Player player, Enemy[] enemies, RandomChest randomChest) {
        initMap();
        map[player.getY()][player.getX()] = '@';
        map[randomChest.getX()][randomChest.getY()] = 'C';
        for (Enemy enemy : enemies) {
            map[enemy.getX()][enemy.getY()] = 'E';
        }
    }

    public void render(Player player, Enemy[] enemies, RandomChest randomChest, Projectile projectile) {
        initMap();
        map[player.getY()][player.getX()] = '@';
        map[randomChest.getX()][randomChest.getY()] = 'C';
        for (Enemy enemy : enemies) {
            map[enemy.getX()][enemy.getY()] = 'E';
        }
        map[projectile.getX()][projectile.getY()] = '+';
    }

    public void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 0 || j == 0 || i == map.length - 1 || j == map[i].length - 1) {
                    map[i][j] = '|';
                } else {
                    map[i][j] = '.';
                }
            }
        }
    }

    public char[][] getMap() {
        return map;
    }

    // Дополнительный метод для отображения карты
    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
