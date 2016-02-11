package metafunctionality

import grails.persistence.Entity


@Entity
abstract class ModuleInput extends ModuleData {

    static constraints = {
        name(unique: true)
    }

    String name

}
