package intellidots

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
