package dnd.supers.buff;

import dnd.supers.Player;

public enum PositiveBuff {
    HEALTH("Healing", "Up hp on 10%"),
    MANA("Mana Regeneration", "Up mana on 10%"),
    STRENGTH("Strength Buff", "Up melee damage on 10%"),
    DEXTERITY("Dexterity Buffer", "Up speed on 10%"),
    CONSTITUTION("Constitution Buff", "Up defense on 10%"),
    INTELLIGENCE("Intelligence Buffer", "Up intelligence on 10%"),
    CHARISMA("Charisma Buff", "Up charisma on 10%"),
    ;

    private final String NAME;
    private final String DESCRIPTION;

    PositiveBuff(String name, String description) {
        NAME = name;
        DESCRIPTION = description;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void apply(Player player) {
        switch (this) {
            case HEALTH:
                player.increaseHealth(player.getHealth() * 1.10);
                break;
            case MANA:
                player.increasemaxHealth(player.getMaxHealth() * 1.10);
                break;
            case STRENGTH:
                player.increaseAttack(player.getAttack() * 1.10);
                break;
            case DEXTERITY:
                player.increaseDefense(player.getDefense() * 1.10);
                break;
            case CONSTITUTION:
                player.increasespeed(player.getSpeed() * 1.10);
                break;
        }
    }
}
