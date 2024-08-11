package dnd;

import dnd.supers.action.ActionType;

@FunctionalInterface
public interface Action {
    Object doAction(ActionType type);
}
