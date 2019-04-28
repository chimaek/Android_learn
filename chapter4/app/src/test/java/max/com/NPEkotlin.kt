package max.com

fun strLenNonNUll(str:String):Int{
    return str.length
}
fun strLenNUllAble(str: String?):Int{

    //에러발생 널가능성이 있기때문에
    //return str.length

    if(str != null){
        return str.length
    }else{
        return 0
    }
}
fun strLastCharNullable(str: String?):Char?{
    return str?.get(str.length-1)
}