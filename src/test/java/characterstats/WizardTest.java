package characterstats;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {
    Wizard wizard;
    Spell spell;
    Spell spell2;
    Creature creature;


    @Before
    public void setUp() {
        creature = new Creature();
        spell = new Spell("Fireball", SpellType.FIRE, 20);
        spell2 = new Spell("Freeze", SpellType.WATER, 15);
        wizard = new Wizard("Rincewind", 20, 20, creature, WizardType.FIRE);
    }

    @Test
    public void getCurrentMp() {
        assertEquals(20, wizard.getCurrentMp());
    }

    @Test
    public void getMaxMp() {
        assertEquals(20, wizard.getMaxMp());
    }

    @Test
    public void getBookOfSpells() {
        assertEquals(0, wizard.getBookOfSpells().size());
    }

    @Test
    public void addSpell() {
        wizard.addSpell(spell);
        wizard.addSpell(spell);
        assertEquals(2, wizard.getBookOfSpells().size());
    }

    @Test
    public void castSpell() {
        wizard.addSpell(spell);
        wizard.addSpell(spell);
        assertEquals(2, wizard.getBookOfSpells().size());
        assertEquals("Fireball is cast!", wizard.castSpell(spell));
    }

    @Test
    public void spellCanBeNotFound(){
        wizard.addSpell(spell);
        assertEquals(1, wizard.getBookOfSpells().size());
        assertEquals("Fireball is cast!", wizard.castSpell(spell));
        assertEquals("Freeze not found", wizard.castSpell(spell2));
    }

    @Test
    public void getName() {
    }

    @Test
    public void getCurrentHp() {
    }

    @Test
    public void getMaxHp() {
    }

//    @Test
//    public void getItems() {
//    }

    @Test
    public void getBaseAttack() {
    }

    @Test
    public void getBaseDefence() {
    }

//    @Test
//    public void getActions() {
//    }
//
//    @Test
//    public void getEquippedItem() {
//    }
//
//    @Test
//    public void getCurrentRoom() {
//    }

    @Test
    public void setCurrentHp() {
    }

//    @Test
//    public void addItem() {
//    }
//
//    @Test
//    public void addAction() {
//    }

//    @Test
//    public void changeItem() {
//    }

//    @Test
//    public void unequipItem() {
//    }

//    @Test
//    public void changeRoom() {
//    }

//    @Test
//    public void useItem() {
//    }

    @Test
    public void takeDamage() {
    }

    @Test
    public void simpleAttack() {
    }
}