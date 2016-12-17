package intellidots

import javax.script.ScriptEngineManager

class BootStrap {

    def users = [
            [username: 'kudinova', firstName: 'Валерия', lastName: 'Кудинова'],
            [username: 'andrusenko', firstName: 'Иван', lastName: 'Андрусенко'],
            [username: 'bukin', firstName: 'Игорь', lastName: 'Букин'],
            [username: 'brizitskiy', firstName: 'Богдан', lastName: 'Бризицкий'],
            [username: 'strelyanyy', firstName: 'Владислав', lastName: 'Стреляный'],
            [username: 'tsebro', firstName: 'Денис', lastName: 'Цебро'],
    ]

    def adminRole = new Role(authority: 'Admin')
    def userRole = new Role(authority: 'User')

    def init = { servletContext ->
        adminRole.save()
        userRole.save()

        def admin = new User(username: 'admin', password: 'admin', firstName: 'Александр', lastName: 'Щербаков')
        admin.save()
        new UserRole(user: admin, role: adminRole).save()

        users.each {
            def user = new User(username: it.username, password: 'pass', firstName: it.firstName, lastName: it.lastName)
            user.save()
            new UserRole(user: user, role: userRole).save()
        }
    }
    def destroy = {
    }
}
