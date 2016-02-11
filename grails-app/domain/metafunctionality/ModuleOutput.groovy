package metafunctionality

import grails.persistence.Entity

@Entity
class ModuleOutput extends ModuleData {

    static constraints = {
    }



    static hasMany = [headers: String, valueRows: String]
    List valueRows
    List headers
}
