package dnd.supers.service;

import dnd.supers.Player;
import dnd.supers.engine.Graphics;
import dnd.supers.generated.RandomChest;
import dnd.supers.service.util.Directions;

import java.util.LinkedList;

public class PlayerService implements Movable {
    private final Player player;
    private final Graphics graphics;
    private final EnemyService enemyService;
    private final ShootService shootService;
    private final RandomChest[] chests = new RandomChest[]{
            new RandomChest(),
            new RandomChest(),
    };
    private LinkedList<String> actionHistory = new LinkedList<>();

    public PlayerService(Player player, Graphics graphics, EnemyService enemyService, ShootService shootService) {
        this.player = player;
        this.graphics = graphics;
        this.enemyService = enemyService;
        this.shootService = shootService;
    }

    @Override
    public void move(Directions directions) {
        switch (directions) {
            case LEFT:
                player.setX(player.getX() - 1);
                break;
            case RIGHT:
                player.setX(player.getX() + 1);
                break;
            case UP:
                player.setY(player.getY() - 1);
                break;
            case DOWN:
                player.setY(player.getY() + 1);
                break;
        }
        actionHistory.add("Moved " + directions);
        enemyService.moveEnemies();
        graphics.render(player, enemyService.getEnemy(), chests[0]);
    }



    public void displayActionHistory() {
        System.out.println("Player Action History:");
        for (String action : actionHistory) {
            System.out.println(action);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public EnemyService getEnemyService() {
        return enemyService;
    }

    public ShootService getShootService() {
        return shootService;
    }

    public void doShoot(char direction) {
        shootService.doShoot(player, direction, graphics, enemyService.getEnemy(),new RandomChest());
    }
}