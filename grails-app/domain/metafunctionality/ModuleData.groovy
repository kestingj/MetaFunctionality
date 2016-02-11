package metafunctionality

import grails.persistence.Entity

@Entity
abstract class ModuleData {

    static constraints = {
        moduleDataID(unique: true)
    }

    String moduleDataID = UUID.randomUUID().toString()
    Date timestamp = new Date()
    String type
}
