package dnd.supers.engine;

import dnd.supers.Enemy;
import dnd.supers.Player;
import dnd.supers.generated.RandomChest;

public class Graphics {

    // enemy - E, position = [x][y]
    // random chest - C, position = [x][y]
    // player - @, position = [x][y]
    // wall - |, position = [x][y]
    // floor = ., position = [x][y]

    private final char[][] map = new char[30][30];

    public void render(Player player, Enemy[] enemies, RandomChest randomChest) {
        initMap();
        map[player.getY()][player.getX()] = '@';
        map[randomChest.getX()][randomChest.getY()] = 'C';
        for (Enemy enemy : enemies) {
            map[enemy.getX()][enemy.getY()] = 'E';
        }
    }

    public void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 0 || j == 0 || i == map.length - 1 || j == map[i].length - 1) {
                    map[i][j] = '|';
                } else map[i][j] = '.';
            }
        }
    }

    public char[][] getMap() {
        return map;
    }

}
