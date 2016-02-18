package metafunctionality

import grails.persistence.Entity

import java.text.DateFormat
import java.text.SimpleDateFormat

@Entity
abstract class ModuleData {

    static constraints = {
        moduleDataID(unique: true)
    }

    String moduleDataID = UUID.randomUUID().toString()
    Date timestamp = new Date()
    String type

    def dateString() {
        SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy")
        return formater.format(timestamp)
    }
}
