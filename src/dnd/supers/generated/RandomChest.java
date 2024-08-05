package dnd.supers.generated;

import dnd.supers.item.Usable;
import dnd.util.ItemRandomisation;

public class RandomChest {

    private final int x;
    private final int y;
    private final Usable[] items;

    public RandomChest() {
        this.x = 1 + (int) (Math.random() * 29);
        this.y = 1 + (int) (Math.random() * 29);
        this.items = ItemRandomisation.initItems(1);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Usable[] getItems() {
        return items;
    }

}
