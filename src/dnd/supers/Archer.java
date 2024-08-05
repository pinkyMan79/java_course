package dnd.supers;

import dnd.supers.action.ActionType;
import dnd.supers.item.Usable;
import sun.security.pkcs11.P11Util;

public final class Archer extends Player {

    public Archer(Usable[] items) {
        super(items);
        setHealth(75);
        setAttack(10);
        setDefense(30);
        setMaxHealth(75);
    }

    @Override
    public Object doAction(ActionType type) {
        return null;
    }

    public void aim() {
        setAttack(getAttack() * 2);
    }
}
