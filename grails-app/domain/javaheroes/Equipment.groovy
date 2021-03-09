package javaheroes

class Equipment {
    
    String name
    String type
    int strength
    int dexterity
    int constitution
    int intelligence
    int charisma
    int luck
    String classRestriction

    static constraints = {
        name nullable: false
        name maxSize: 255
        type maxSize: 255
        classRestriction maxSize: 255
    }
}
