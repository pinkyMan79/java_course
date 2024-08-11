package dnd.supers;

import dnd.supers.action.ActionType;
import dnd.supers.item.Usable;
import dnd.util.ItemRandomisation;

public final class Magician extends Player {

    public Magician(Usable[] items) {
        super(items);
    }

    @Override
    public Object doAction(ActionType type) {
        return null;
    }

    public void meditation() {
        setIntelligence(getIntelligence() * 2);
        setDefense(getDefense() / 2);
    }

}
