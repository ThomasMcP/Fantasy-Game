@startuml
class Character{
  name String,
  currentHp int,
  maxHp int,
  items ArrayList<Item>,
  baseAttack int,
  baseDefence int,
  actions ArrayList<Action>
  equippedItem Item,
  currentRoom Room

  +changeItem(Item item)
  +simpleAttack()
  +unequipItem()
  +changeRoom(Room room)
  +leaveDungeon()
  +useItem()
  +takeDamage() promise method
}
Enum CreatureType {
    DRAGON,
    IMP,
    ORC
}
CreatureType *-- Creature
class Creature{
    type CreatureType
}
Creature --|> Character
Creature *-- Wizard
class magicUser{
    currentMp int,
    maxMp int,
    bookOfSpells ArrayList<Spell>

    +castSpell()

}
magicUser --|> Character
Interface PickUpLoot{
    getLoot()   
}
Wizard --|> magicUser
PickUpLoot --> Wizard
PickUpLoot --> Warrior
class Wizard{
    familiar Creature,
    lore WizardType
    treasureSack int
}
Enum WizardType {
    FIRE
    WATER
    LIGHT
}
WizardType *-- Wizard
class Warrior {
    type WarriorType,
    currentStamina int,
    maxStamina int
    treasureSack int

    +warriorAttack()

}
Warrior --|> Character
Enum WarriorType {
    DWARF,
    BARBARIAN,
    KNIGHT
}
WarriorType *-- Warrior
class Room {
    Enemies ArrayList<Character>,
    Friendlies ArrayList<Character>
    treasure int

    +generateEnemies()
    +generateTreasure()
}
class Dungeon {
    roomTypes ArrayList<Room>,
    playerCharacters ArrayList<Character>

    +generateRoom()
}
Dungeon --> Room
Dungeon --> Character
class Item {
    type ItemType
}
Enum ItemType {
    STAMINA,
    MANA,
    HEALTH,
    ACTION
}
ItemType *-- Item
Item *-- Character
class Action {
    type ActionType
}
Enum ActionType {
    OFFENCE,
    DEFENCE,
    HEAL,
}
ActionType *-- Action
Action *-- Character
@enduml
