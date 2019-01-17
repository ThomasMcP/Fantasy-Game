package characterstats;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;

public abstract class MagicUser extends Character {
    private int currentMp;
    private int maxMp;
    private ArrayList<Spell> bookOfSpells;

    public MagicUser(String name, int maxHp, int maxMp) {
        super(name, maxHp);
        this.currentMp = maxMp;
        this.maxMp = maxMp;
        this.bookOfSpells = new ArrayList<>();
    }

    public MagicUser(String name, int maxHp, int maxMp, ArrayList<Spell> bookOfSpells) {
        super(name, maxHp);
        this.currentMp = maxMp;
        this.maxMp = maxMp;
        this.bookOfSpells = bookOfSpells;
    }

    public int getCurrentMp() {
        return currentMp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public ArrayList<Spell> getBookOfSpells() {
        return new ArrayList<>(bookOfSpells);
    }

    public void addSpell(Spell spell){
        bookOfSpells.add(spell);
    }

    public String castSpell(Spell spell){
        for (Spell chosenSpell: bookOfSpells){
            if (chosenSpell.getName() == spell.getName()) {
                //TODO: Spell effect;
                return chosenSpell.getName() + " is cast!";
            }
        }
        return spell.getName() + " not found";
    }


}
