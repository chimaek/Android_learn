package max.com

class Sample {
    val field = 0
    //코틀린은 내부에 클래스를 선언하면 중첩클래스가 됨
    class NestedClass{

    }
    inner class innerClass{
        val myFiled = field
    }
}