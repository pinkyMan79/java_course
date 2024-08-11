package dnd.supers;

import dnd.supers.action.ActionType;
import dnd.supers.item.Usable;

public final class Barbarian extends Player {

    public Barbarian(Usable[] items) {
        super(items);
    }

    @Override
    public Object doAction(ActionType type) {
        return null;
    }

    public void rage() {
        setAttack(getAttack() * 2);
        setHealth(getHealth() * 2);
        setSpeed(getSpeed() * 2);
        setDefense(getDefense() / 2);
        setIntelligence(getIntelligence() / 2);
    }
}
