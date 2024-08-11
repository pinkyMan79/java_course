package dnd.supers;

public class Enemy {

    private int health; //player's health points
    private int maxHealth; //player's max health points
    private int attack; //player's attack points

    private int x = 1 + (int)(Math.random() * 29); //player's x position
    private int y = 1 + (int)(Math.random() * 29); //player's x position


    public Enemy(int health, int maxHealth, int attack) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.attack = attack;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
