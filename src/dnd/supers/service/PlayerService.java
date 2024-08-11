package dnd.supers.service;

import dnd.supers.Player;
import dnd.supers.engine.Graphics;
import dnd.supers.generated.RandomChest;
import dnd.supers.service.util.Directions;

public class PlayerService implements Movable {
    private final Player player;
    private final Graphics graphics;
    private final EnemyService enemyService;
    private final RandomChest[] chests = new RandomChest[]{
            new RandomChest(),
            new RandomChest(),
    };

    public PlayerService(Player player, Graphics graphics, EnemyService enemyService) {
        this.player = player;
        this.graphics = graphics;
        this.enemyService = enemyService;
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
        enemyService.moveEnemies();
        graphics.render(player, enemyService.getEnemy(), chests[0]);
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
}
