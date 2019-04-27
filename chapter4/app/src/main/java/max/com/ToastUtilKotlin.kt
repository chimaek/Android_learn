@file:JvmName("ToastUtil")
//어노테이션을 이용 다른 클래스에서 접근할수있는 이름변경
package max.com

import android.widget.Toast

fun toastShort(message:String){
    Toast.makeText(MainApplication.getAppContext(),message,Toast.LENGTH_SHORT).show()
}
fun toastLong(message:String){
    Toast.makeText(MainApplication.getAppContext(),message,Toast.LENGTH_LONG).show()
}