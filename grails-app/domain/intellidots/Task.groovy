package intellidots

import grails.rest.Resource

@Resource(uri='/tasks')
class Task {

    String name
    String htmlBody

    Integer getPoints() {
        tests.sum({ it.points }) as Integer
    }

    static hasMany = [tests: Test]

    static belongsTo = [tournament: Tournament]

    static transients = ['points']

    static constraints = {
    }
}
