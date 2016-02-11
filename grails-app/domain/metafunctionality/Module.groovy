package metafunctionality

import grails.persistence.Entity

@Entity
class Module {
    
    String moduleId = UUID.randomUUID().toString()
    String inputID
    boolean isCompleted = false
    static hasMany = [outputIDs:String]
    List outputIDs
    String type

    static constraints = {
        moduleId blank: false, unique: true
        inputID blank: false
    }
}
