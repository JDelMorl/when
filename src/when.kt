fun main(args: Array<String>) {
    var dayString = "x"
    print("enter a number between 1 and 10: ")
    val number = Integer.valueOf(readLine())

    when (number){
        1 -> dayString = "1 is ichi in Japanese"
        2 -> dayString = "2 is ni in Japanese"
        3 -> dayString = "3 is san in Japanese"
        4 -> dayString = "4 is yon in Japanese"
        5 -> dayString = "5 is go in Japanese"
        6 -> dayString = "6 is roku in Japanese"
        7 -> dayString = "7 is nana in Japanese"
        8 -> dayString = "8 is hachi in Japanese"
        9 -> dayString = "9 is kyuu in Japanese"
        10 -> dayString = "10 is juu in Japanese"
        !in 1..10 -> dayString ="Out of Range"
        else -> dayString = "Unknown"
    }

    println(dayString)

}