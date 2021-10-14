fun main(args: Array<String>) {
    val name = "Haya"
    var healthPoints = 98


    val Karma = (Math.pow(Math.random(), (110- healthPoints)/ 100.0) * 20 ) .toInt()
    println("Oura Color:")


    if (Karma in 0..5) { println( "$Karma" +"the oura color is Red")}
    else if (Karma in 6..10) println("$Karma" + "the oura color is Orang")
    else if (Karma in 11..15) println("$Karma" + " the oura color is Purple")
    else if (Karma in 16..20) println("$Karma" + "the oura color is Green")

}