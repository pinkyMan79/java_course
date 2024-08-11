package dnd.supers.service;

import dnd.supers.Enemy;
import dnd.supers.engine.Projectile;
import dnd.supers.service.util.Directions;

import java.util.Scanner;

// Скорее всего, бесполезная хуйня, методы которой надо перенести в Projectile, зато удобная
public class ProjectileService implements Movable {
    private final Projectile projectile;
    private final Enemy[] enemy;

    public ProjectileService(Projectile projectile, Enemy[] enemy) {
        this.projectile = projectile;
        this.enemy = enemy;
    }

    public void Shoot(){
        Scanner sc = new Scanner(System.in);
        Directions direction = null;
        // определяем направление полёта снаряда
        switch (sc.nextLine()) {
            case "w":
                direction = Directions.UP;
                break;
            case "a":
                direction = Directions.LEFT;
                break;
            case "s":
                direction = Directions.DOWN;
                break;
            case "d":
                direction = Directions.RIGHT;
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
        int i = 0;
        // TODO Спросить, как проверить наличие врага на клеточке без цикла.
        //  Варианты:
        //  1) по значку "Е" и потом "бить" объект врага, соответствующий ему
        //  2) написать метод contains или что-то похожее
        while (i < projectile.getDistance()) {
            assert direction != null;
            move(direction);
            for (Enemy e : enemy) {
                if (e.getX() == projectile.getX() && e.getY() == projectile.getY()) {
                    int health = e.getHealth() - projectile.getDamage();
                    e.setHealth(health);
                    return;
                }
            }
            i++;
        }
    }

    // TODO метод Cast, который будет стрелять заклинанием с радиусом действия

    @Override
    // TODO Как сделать этот метод приватным? Он используется только внутри, и не должен быть доступен юзеру
    public void move(Directions directions) {
        switch (directions) {
            case LEFT:
                projectile.setX(projectile.getX() - 1);
                break;
            case RIGHT:
                projectile.setX(projectile.getX() + 1);
                break;
            case UP:
                projectile.setY(projectile.getY() - 1);
                break;
            case DOWN:
                projectile.setY(projectile.getY() + 1);
                break;
        }
    }
}
