package strings

//扩展函数
fun String.lastChar() : Char = this[this.length -1]

//扩展属性
val String.lastChar : Char get() = this[this.length - 1]

var StringBuilder.lastChar : Char get() = this[this.length - 1]
set(value) {this.setCharAt(this.length -1, value)}

