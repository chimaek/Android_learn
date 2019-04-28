package max.com

import kotlin.reflect.KProperty

class DelegateString {
    var text = ""

    operator fun getValue(thisRef: Any, property: KProperty<*>): String {
        return text
    }

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        text = value.toUpperCase()

        println("$value ==> ${text}")
    }

}