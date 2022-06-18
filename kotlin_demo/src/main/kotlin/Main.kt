fun main(args: Array<String>) {

    // todo 声明变量
//    var name: String = "kotlin"
//    name = "my"
//    println(name)

    var week = 5

    var t = when(week) {
        1 -> println("1")
        2 -> println("2")
        5 -> println("5")
        else -> {
            println("123")
        }
    }

    if(week in 0..6) {
        println("good")
    } else {
        println("bad")
    }
}
