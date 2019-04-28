package max.com

import java.io.InputStreamReader
import java.net.URL

class User {
    var nickname by DelegateString()

    //lazy는 val로만 선언가능
    //왜 lazy를 쓸까? == 네트워크에서 받아오는 데이터는 속도가 느려 초기화할때 전체적인
    //시스템의 저하가 나오기때문에 실행시에만 초기화시켜주는게 효율적
    val http by lazy {
        println("lazy start")
        InputStreamReader(URL("http://www.naver.com").openConnection().getInputStream()).readText()
    }

}