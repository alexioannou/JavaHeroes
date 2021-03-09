package javaheroes

class Hero {
    
    String firstName
    String lastName
    int level
    int strength
    int dexterity
    int constitution
    int intelligence
    int charisma
    int luck
    int max_hp
    int max_mp
    String className

    static constraints = {
        firstName nullable: false
        firstName maxSize: 255
        lastName maxSize: 255
        level nullable: false
        level min: 1
        className maxSize: 255
        className inList: ['Warrior', 'Paladin', 'Priest', 'Mage', 'Warlock', 'Rogue', 'Ranger']
    }
}
