package dnd.supers.service;

import dnd.supers.Player;
import dnd.supers.Enemy;
import dnd.supers.engine.Graphics;
import dnd.supers.generated.RandomChest;

import java.util.LinkedList;

public class ShootService {

    private static final int MAX_DISTANCE = 5;
    //private LinkedList<String> Shoothistory = new LinkedList<>();

    public void doShoot(Player player, char direction, Graphics graphics, Enemy[] enemies, RandomChest randomChest) {
        int x = player.getX();
        int y = player.getY();

        for (int i = 0; i < MAX_DISTANCE; i++) {
            switch (direction) {
                case 'l':
                    x--;
                    break;
                case 'r':
                    x++;
                    break;
                case 'u':
                    y--;
                    break;
                case 'd':
                    y++;
                    break;
                default:
                    return;
            }
            //Shoothistory.add("Shoot" + direction);

            // If the shot goes out of bounds, stop the shot
            if (x < 0 || x >= graphics.getMap()[0].length || y < 0 || y >= graphics.getMap().length) {
                break;
            }

            // Update the map with the projectile
            graphics.getMap()[y][x] = '*';

            // Slight delay to simulate movement of the projectile
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    /* public void displayShootHistory() {


        }
    */
    }
