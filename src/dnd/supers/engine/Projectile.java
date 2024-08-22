package dnd.supers.engine;

import dnd.supers.Player;
import dnd.supers.service.Movable;
import dnd.supers.service.util.Directions;

import java.util.Scanner;

// По идее, должен быть абстрактным, чтобы потом от него наследовать разные типы снарядов
public final class Projectile /*implements Movable*/ {
    private final Player player; // нужен или не нужен конструктор?
    private final int distance = 5;
    private final int damage = 5;
    // по идее, берёт координаты игрока, от которого летит
    private int x;
    private int y;

    public Projectile(Player player) {
        this.player = player;
        x = player.getX();
        y = player.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDistance() {
        return distance;
    }

    public int getDamage() {
        return damage;
    }

    public Player getPlayer() {
        return player;
    }
}