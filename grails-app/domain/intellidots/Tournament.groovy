package intellidots

import grails.rest.Resource

@Resource(uri='/tournaments')
class Tournament {

    String topic
    String description
    Date startDate
    Date endDate
    boolean enabled = true

    static hasMany = [tasks: Task]

    static constraints = {
        startDate blank: false, nullable: false
        topic blank: false, topic: false
    }
}
