package max.com

//String 클래스에 lastString이라는 확장함수를 추가한다.
fun String.lastString(): String {
    return this.get(this.length - 1).toString()
}

class ExtTest {

    fun String.extFunc() {
        println(this.lastString())
    }

    fun method1() {
        "test".extFunc()
    }
}

fun test() {
    "Test".lastString()

}