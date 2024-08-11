package dnd.supers.engine;

import dnd.supers.Player;
import dnd.supers.service.Movable;
import dnd.supers.service.util.Directions;

import java.util.Scanner;

// По идее, должен быть абстрактным, чтобы потом от него наследовать разные типы снарядов
public class Projectile /*implements Movable*/ {
    private Player player; // нужен или не нужен конструктор?
    int distance;
    int damage;
    // по идее, берёт координаты игрока, от которого летит
    private int x = player.getX();
    private int y = player.getY();

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

    public int getDistance(){
        return distance;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

//    @Override
//    public void move(Directions directions) {
//        final Projectile projectile;
//        Scanner sc = new Scanner(System.in);
//        Directions direction = null;
//        // определяем направление полёта снаряда
//        switch (sc.nextLine()) {
//            case "w":
//                direction = Directions.UP;
//                break;
//            case "a":
//                direction = Directions.LEFT;
//                break;
//            case "s":
//                direction = Directions.DOWN;
//                break;
//            case "d":
//                direction = Directions.RIGHT;
//                break;
//            default:
//                System.out.println("Incorrect input");
//                break;
//        }
//        switch (direction) {
//            case LEFT:
//                projectile.setX(projectile.getX() - 1);
//                break;
//            case RIGHT:
//                projectile.setX(projectile.getX() + 1);
//                break;
//            case UP:
//                projectile.setY(projectile.getY() - 1);
//                break;
//            case DOWN:
//                projectile.setY(projectile.getY() + 1);
//                break;
//        }
//    }
}
