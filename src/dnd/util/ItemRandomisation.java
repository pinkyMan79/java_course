package dnd.util;

import dnd.supers.item.Armor;
import dnd.supers.item.Potion;
import dnd.supers.item.Trinkets;
import dnd.supers.item.Usable;

public class ItemRandomisation {

    private static final Usable[] defaultUsables = new Usable[]{
            new Armor(),
            new Potion(),
            new Trinkets(),
            new Armor(),
            new Potion(),
    };

    public static Usable[] initItems(int luckyPoints) {
        int itemCount = (int) (Math.random() * 100 + luckyPoints);
        Usable[] items = new Usable[itemCount];
        for (int i = 0; i < itemCount; i++) {
            items[i] = defaultUsables[(int) (Math.random() * defaultUsables.length)];
        }
        return items;
    }

}
