@file:JvmName("StringFunction")
package strings

var opCount = 0
const val UNIX_LINE_SEPARATOR = "/n"

//带有默认值参数的函数
//不使用命名参数 不能省略中间参数, 使用命名参数可以省略中间的一些参数
fun <T> Collection<T>.joinToString(separator: String = UNIX_LINE_SEPARATOR,
                     prefix : String = "",
                     postfix : String = "") : String{

    opCount++
    val result = StringBuilder(prefix)

    //withIndex 属于解构生命
    for ((index, element) in this.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun Collection<String>.join(separator: String = ",",
                            prefix: String = "",
                            postfix: String = "") = joinToString(separator, prefix, postfix)

fun reportOpCount(){
    println("Operation performed $opCount times")
}