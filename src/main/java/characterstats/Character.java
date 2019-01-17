package characterstats;

import dungeoncontents.Room;
import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int currentHp;
    private int maxHp;
    private ArrayList<Item> items;
    private int baseAttack;
    private int baseDefence;
    private ArrayList<Action> actions;
    private Item equippedItem;
    private Room currentRoom;

    public Character(String name, int maxHp) {
        this.name = name;
        this.currentHp = maxHp;
        this.maxHp = maxHp;
        this.baseAttack = 10;
        this.baseDefence = 5;
        this.items = new ArrayList<>();
        this.actions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefence() {
        return baseDefence;
    }

    public ArrayList<Action> getActions() {
        return new ArrayList<>(actions);
    }

    public Item getEquippedItem() {
        return equippedItem;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentHp(int currentHp) {
        if (currentHp > maxHp) {
            currentHp = maxHp;
        } else if (currentHp < 0){
            currentHp = 0;
        }
        this.currentHp = currentHp;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addAction(Action action) {
        this.actions.add(action);
    }

    public void changeItem(Item equippedItem) {
        this.equippedItem = equippedItem;
    }

    public void unequipItem() {
        this.equippedItem = null;
    }

    public void changeRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }

    public abstract String takeDamage(int damage);

    public abstract String simpleAttack(Character enemy);

    public String useItem(Item item){
        //TODO Item effects
        this.items.remove(item);
        return item + " has been used.";
    }
}
