package javaheroes

class Party {

    Dungeon dungeon
//    static hasOne = [dungeon:Dungeon]
    
    static hasMany = [heroes:Hero]
    
    static constraints = {
//        dungeon unique: true
    }
}
