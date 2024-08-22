package dnd.impl;

import dnd.supers.Barbarian;
import dnd.supers.Enemy;
import dnd.supers.Magician;
import dnd.supers.Player;
import dnd.supers.engine.Graphics;
import dnd.supers.generated.RandomChest;
import dnd.supers.item.Armor;
import dnd.supers.item.Potion;
import dnd.supers.item.Usable;
import dnd.supers.service.EnemyService;
import dnd.supers.service.PlayerService;
import dnd.supers.service.ShootService;
import dnd.supers.service.util.Directions;
import dnd.util.ItemRandomisation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //read input stream from console
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Graphics g = new Graphics();
        g.initMap();
        EnemyService es = new EnemyService(
                new Enemy[]{
                        new Enemy(5, 5, 1),
                        new Enemy(5, 5, 1),
                        new Enemy(15, 15, 3),
                        new Enemy(15, 15, 3),
                        new Enemy(30, 30, 6),
                }
        );
        Player p = new Magician(ItemRandomisation.initItems(1 + (int) (Math.random() * 3)));
        ShootService shootService = new ShootService();
        PlayerService service = new PlayerService(p, g, es, shootService);
        RandomChest randomChest = new RandomChest();
        out(g.getMap());
        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break; // Выход из цикла и завершение игры
            }

            boolean validCommand = true;

            switch (input) {
                case "w":
                    service.move(Directions.UP);
                    break;
                case "a":
                    service.move(Directions.LEFT);
                    break;
                case "s":
                    service.move(Directions.DOWN);
                    break;
                case "d":
                    service.move(Directions.RIGHT);
                    break;
                case "shoot-l":
                    shootService.doShoot(p, 'l', g, es.getEnemy(), randomChest);
                    break;
                case "shoot-r":
                    shootService.doShoot(p, 'r', g, es.getEnemy(), randomChest);
                    break;
                case "shoot-u":
                    shootService.doShoot(p, 'u', g, es.getEnemy(), randomChest);
                    break;
                case "shoot-d":
                    shootService.doShoot(p, 'd', g, es.getEnemy(), randomChest);
                    break;
                case "history":
                    service.displayActionHistory();
                case "Shoothistory":
                    //shootService.displayShootHistory();
                default:
                    System.out.println("Unknown command: " + input);
                    validCommand = false;
            }
            out(g.getMap());


            // Добавление задержки
            Thread.sleep(100);
        }
    }

        public static void out(char[][] chars) {
        for (char[] chars1 : chars) {
            for (char aChars1 : chars1) {
                System.out.print(aChars1 + " ");
            }
            System.out.println();
        }
    }

}
