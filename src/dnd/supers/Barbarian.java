package dnd.supers;

import dnd.supers.action.ActionType;
import dnd.supers.contracts.Damageable;
import dnd.supers.item.Usable;

public final class Barbarian extends Player{

    public Barbarian(Usable[] items) {
        super(items);
        setHealth(20);
        setAttack(10);
        setDefense(10);
        setMaxHealth(20);
        setIntelligence(0);
    }

    @Override
    public Object doAction(ActionType type) {
        return null;
    }

    public void rage() {
        setAttack(getAttack() * 2);
        setDefense(0);
    }

}
