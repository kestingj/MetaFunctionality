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

    def getOutputs() {
        if (isCompleted) {
            List<ModuleOutput> outputs = new ArrayList<>()
            for (outputID in outputIDs) {
                outputs.add(ModuleOutput.findByModuleDataID(outputID))
            }
            return outputs
        } else {
            return null
        }
    }

    def getInput() {
        return ModuleInput.findByModuleDataID(inputID)
    }
}
