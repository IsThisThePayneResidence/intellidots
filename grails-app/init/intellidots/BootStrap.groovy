package intellidots

class BootStrap {
    def tournament = new Tournament(topic: 'Комбинаторика', description: 'Комбинаторика', startDate: new Date(), endDate: new Date(System.currentTimeMillis() + 86400000 * 7)).save()
    def task = new Task(name: 'Разбиения на слагаемые', htmlBody: '<img src="https://pp.vk.me/c626120/v626120043/46873/lSIDf4WDoAE.jpg"/>', tournament: tournament).save()
    def test = new Test(input: "1 5 3 2 6", output: "1 2 3 5 6", points: 0, task: task).save()
    def users = [
            [username: 'kudinova', firstName: 'Валерия', lastName: 'Кудинова'],
            [username: 'andrusenko', firstName: 'Иван', lastName: 'Андрусенко'],
            [username: 'bukin', firstName: 'Игорь', lastName: 'Букин'],
            [username: 'brizitskiy', firstName: 'Богдан', lastName: 'Бризицкий'],
            [username: 'strelyanyy', firstName: 'Владислав', lastName: 'Стреляный'],
            [username: 'tsebro', firstName: 'Денис', lastName: 'Цебро'],
    ]

    def adminRole = new Role(authority: 'ROLE_ADMIN')
    def userRole = new Role(authority: 'ROLE_USER')

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
