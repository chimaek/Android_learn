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

    @Test
    fun test6(){
        val animal = Animal(mutableMapOf("name" to "cat","age" to 20))

        Assert.assertEquals("cat",animal.name)

        Assert.assertEquals(20,animal.age)

        animal.name ="dog"
        animal.age=21

        Assert.assertEquals("dog",animal.map["name"])

        Assert.assertEquals(21,animal.map["age"])

    }

    @Test
    fun test7(){
        val s =SingletonKotlin.log("me")
        println(s)
    }

    @Test
    fun testFruit(){
        val fruit = Fruit("바나나","바나나길이")
        val fruit2 = Fruit("바나나","바나나길이")
        println(fruit)
        println(fruit2)

        Assert.assertEquals(fruit,fruit2)

        Assert.assertEquals(fruit.hashCode(),fruit2.hashCode())

    }
}