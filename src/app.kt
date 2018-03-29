import strings.*
import strings.lastChar as lastString

fun main(args: Array<String>) {
    val set = hashSetOf(1,7,15)
    val list = arrayListOf(1, 7,53)
    val stringList = arrayListOf("one", "two","three")
    //to 是中缀调用
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    val view : View
    view = Button()

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list.max())

    println(list.last())
    println(list)

    println(list.joinToString(separator = ":",prefix = "[", postfix = "]"))
    println(list.joinToString())
    println(list.joinToString("-->"))
    println(list.joinToString(prefix = "#", postfix = "]"))
    reportOpCount()

    println("Kotlin".lastString())

    println(stringList.join())

    view.onclick()
    view.showOff()

    println("Kotlin".lastString)

    val sb = StringBuilder("Kotlin?")
    sb.lastString = '!'

    println(sb.lastString)

    test(arrayOf("hyy", "zal"))

    val (number, name) = 1 to "one"



    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

    parsePath("/Users/Heyangyang/kotlin/chapter.adoc")

    val price = """$ {'$'} 99.9"""
    println(price)

    val kotlinLogo = """| //
                       .|//
                       .|/ \
    """.trimMargin(".")

    println(kotlinLogo)

    println(Join.joinToString())
    val user = User(1, "" ,"")
    saveUser(user)



}


fun  test(args: Array<String>){
    val list = listOf("args: ", *args)

    println(list.joinToString(" "))
}



fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfter(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}



class User(val id :Int, val name: String, val address:String)

//将局部函数 提取到 扩展函数中
fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${this.id} : empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "address")
}
//局部函数
fun saveUser(user: User){
   /* fun validate(value: String,
                 fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")*/
    user.validateBeforeSave()

    //保存user到数据库
}
