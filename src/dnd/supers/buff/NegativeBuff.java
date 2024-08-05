package dnd.supers.buff;

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
}
