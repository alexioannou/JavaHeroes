package javaheroes

class Enemy {

    String name
    int level
    int max_hp
    String lootTable
    static hasOne = [boss : Boss]
    
    static constraints = {
        name nullable: false
        level min: 0
        max_hp min: 1
        lootTable maxSize: 255
    }
}
