package characterstats;

import java.util.ArrayList;

public class Wizard extends MagicUser {
    private Creature familiar;
    private WizardType lore;
    private int treasureSack;

    public Wizard(String name, int maxHp, int maxMp, Creature familiar, WizardType lore) {
        super(name, maxHp, maxMp);
        this.familiar = familiar;
        this.lore = lore;
    }

    public Wizard(String name, int maxHp, int maxMp, Creature familiar, WizardType lore, ArrayList<Spell> bookOfSpells) {
        super(name, maxHp, maxMp, bookOfSpells);
        this.familiar = familiar;
        this.lore = lore;
    }

    public String takeDamage(int damage){
        int newHp = getCurrentHp() - damage;
        setCurrentHp(newHp);
        return "You have " + newHp + " hp remaining";
    }

    public String simpleAttack(Character character){
        character.takeDamage(getBaseAttack());
        return "Enemy has " + character.getCurrentHp() + " hp remaining!";
    }
}
