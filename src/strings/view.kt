package strings

open class View{
    open fun onclick() = println("View onclick")
}

class Button: View(){
    override fun onclick() {
        println("Button onclick")
    }
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")