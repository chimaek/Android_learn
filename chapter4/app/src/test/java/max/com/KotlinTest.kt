package max.com

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1() {
        Assert.assertEquals(4, 2 + 2)
    }

    @Test
    fun test2() {
        val person = Person("max")
        person.age = 20
        Assert.assertEquals("max", person.name)
        Assert.assertEquals(20, person.age)
    }

    @Test
    fun test3() {
        val person = Person("max")
        person.nickname = "KAN"
        Assert.assertEquals("kan", person.nickname)

    }

    @Test
    fun testUser() {
        var user = User()
        user.nickname = "death Note"

        Assert.assertEquals("DEATH NOTE", user.nickname)
    }

    @Test
    fun test4() {
        val user = User()

        println("not init")
        Assert.assertNotNull(user.http)
    }

    @Test
    fun test5() {
        val user = User()

        user.name = "join"
        user.name = "james"
    }
}