package dnd.supers.buff;

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
}
