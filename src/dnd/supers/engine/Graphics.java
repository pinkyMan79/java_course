package dnd.supers.engine;

import dnd.supers.Enemy;
import dnd.supers.Player;
import dnd.supers.buff.PositiveBuff;
import dnd.supers.buff.NegativeBuff;
import dnd.supers.generated.RandomChest;

public class Graphics {

    private final char[][] map = new char[30][30];
    private final Tick tick = new Tick(); // Creating Tick example

    public void render(Player player, Enemy[] enemies, RandomChest randomChest) {
        initMap();
        map[player.getY()][player.getX()] = '@';
        map[randomChest.getX()][randomChest.getY()] = 'C';
        for (Enemy enemy : enemies) {
            map[enemy.getX()][enemy.getY()] = 'E';
        }
    }

    public void applyPositiveBuff(Player player, PositiveBuff buff) {
        buff.apply(player);
        tick.increment();
    }

    public void applyNegativeBuff(Player player, NegativeBuff debuff) {
        debuff.apply(player);
        tick.increment();
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

    public int getTickCount() {
        return tick.getCount(); // Get tick iterations
    }

    // Iteration counter
    public static class Tick {
        private int count = 0;

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
}