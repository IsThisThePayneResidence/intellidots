package intellidots

class Test {

    String input
    String output
    Integer points
    Boolean isOrdered = false
    Boolean isUnordered = false
    Boolean isPlainText = true

    static belongsTo = [task: Task]

    static constraints = {
        input blank: false, nullable: false
        output blank: false, nullable: false
        points blank: false, nullable: false
    }

}
