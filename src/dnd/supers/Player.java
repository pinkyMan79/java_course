package dnd.supers;

import dnd.Action;
import dnd.supers.item.Usable;
import dnd.util.ItemRandomisation;

public abstract class Player implements Action {
    private Usable[] items; //array of items in inventory
    protected int health = 100; //player's health points
    protected int maxHealth = 100; //player's max health points
    protected int attack = 0; //player's attack points
    protected int defense = 0; //player's armor points
    protected int speed = 0; //player's speed points
    protected int intelligence = 0; //player's intelligence
    protected int level = 1; //player's level
    public static final int luck = (int) (5 + (Math.random() * 100));

    private int x = 1;
    private int y = 1;

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

    public static int getLuck() {
        return luck;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Player(Usable[] items) {
        this.items = items;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Usable[] getItems() {
        return items;
    }

    public void setItems(Usable[] items) {
        this.items = items;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLevel() {
        return level;
    }
}
