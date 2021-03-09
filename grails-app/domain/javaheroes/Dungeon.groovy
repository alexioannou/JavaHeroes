package javaheroes

class Dungeon {
    
    String name
    int levelRequirement
    int floors

    static constraints = {
        name maxSize: 255
        name nullable: false
        levelRequirement min: 0
        floors min: 1
    }
}
