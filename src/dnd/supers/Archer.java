package dnd.supers;

import dnd.supers.action.ActionType;
import dnd.supers.item.Usable;

public final class Archer extends Player {

    public Archer(Usable[] items) {
        super(items);
        setHealth(15);
        setAttack(10);
        setDefense(5);
        setMaxHealth(15);
        setIntelligence(5);
    }

    @Override
    public Object doAction(ActionType type) {
        return null;
    }

    public void aim() {
        setAttack(getAttack() * 2);
        setDefense(10);
    }

    public void Shoot(){

    }

}
