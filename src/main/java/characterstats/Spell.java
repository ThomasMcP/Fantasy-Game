package characterstats;

public class Spell {

    private String name;
    private SpellType type;
    private int spellEffect;

    public Spell(String name, SpellType type, int spellEffect) {
        this.name = name;
        this.type = type;
        this.spellEffect = spellEffect;
    }

    public String getName() {
        return name;
    }

    public SpellType getType() {
        return type;
    }

    public int getSpellEffect() {
        return spellEffect;
    }
}
