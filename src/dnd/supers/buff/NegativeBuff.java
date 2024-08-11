package dnd.supers.buff;

import dnd.supers.Player;

public enum NegativeBuff {
    HEALTH_DEBUFF("Healing", "Up hp on 10%"),
    MANA_DEBUFF("Mana Regeneration", "Up mana on 10%"),
    STRENGTH_DEBUFF("Strength Buff", "Up melee damage on 10%"),
    DEXTERITY_DEBUFF("Dexterity Buffer", "Up speed on 10%"),
    CONSTITUTION_DEBUFF("Constitution Buff", "Up defense on 10%"),
    INTELLIGENCE_DEBUFF("Intelligence Buffer", "Up intelligence on 10%"),
    CHARISMA_DEBUFF("Charisma Buff", "Up charisma on 10%"),
            ;
    private final String NAME;
    private final String DESCRIPTION;

    NegativeBuff(String name, String description) {
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
            case HEALTH_DEBUFF:
                player.decreaseHealth(player.getHealth() * 0.10);
                break;
            case MANA_DEBUFF:
                player.decreasemaxHealth(player.getMaxHealth() * 0.10);
                break;
            case STRENGTH_DEBUFF:
                player.decreaseAttack(player.getAttack() * 0.10);
                break;
            case DEXTERITY_DEBUFF:
                player.decreaseDefense(player.getDefense() * 0.10);
                break;
            case CONSTITUTION_DEBUFF:
                player.decreaseSpeed(player.getSpeed() * 0.10);
                break;
        }
    }
}
