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
    fun test6() {
        val animal = Animal(mutableMapOf("name" to "cat", "age" to 20))

        Assert.assertEquals("cat", animal.name)

        Assert.assertEquals(20, animal.age)

        animal.name = "dog"
        animal.age = 21

        Assert.assertEquals("dog", animal.map["name"])

        Assert.assertEquals(21, animal.map["age"])

    }

    @Test
    fun test7() {
        val s = SingletonKotlin.log("me")
        println(s)
    }

    @Test
    fun testFruit() {
        val fruit = Fruit("바나나", "바나나길이")
        val fruit2 = Fruit("바나나", "바나나길이")
        println(fruit)
        println(fruit2)

        Assert.assertEquals(fruit, fruit2)

        Assert.assertEquals(fruit.hashCode(), fruit2.hashCode())

    }

    @Test
    fun testLambda1() {
        println(sum(1, 2))
        Assert.assertEquals(3, sum(1, 2))

        Assert.assertEquals(4, { x: Int, y: Int -> x * y }(2, 2))

        val exp = { x: Int, y: Int -> { z: Int -> (x + y) * z } }
        val exp2 = exp(3, 2)
        val reuslt = exp2(4)
        Assert.assertEquals(20, reuslt)
    }

    @Test
    fun testCollectionApi() {

        val list = listOf(1, "2", 3, 4, 5.7, 1, 2)
        // filter는 컬렉션에서 특정조건이 맞는 항목만 추출하여 새로운 컬렉션 만듬
        //int타입만 추출
        println(list.filter { item -> item is Int })
        println(list.filter { it is Int })
        // map은 컬렉션에서 아이템을 반환하여 새로운 컬렉션 만듦 String이 만들어짐
        println(list.map { "value: ${it}" })
        //필터를 적용하여 새로운 맵을 생성
        println(list.filter { it is Int }.map { "value : ${it}" })
        println(list.find { it is Double })
        // 자바 클래스별로 그룹화하여 map의 형태로 반환
        val map = list.groupBy { it.javaClass }
        println(map)

        val list2 = listOf(listOf(1,2), listOf(3,4))

        println(list2)

        println(list2.map { "value : ${it}" })
        //flatMap은 리스트를 평평하게 만들고 변환한다.
        println(list2.flatMap { it.toList() })
    }
}