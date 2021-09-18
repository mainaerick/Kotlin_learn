fun main() {
    val names: Array<String> = arrayOf("erick", "maina", "ndungu")

    // for (name in names) {
    //     println(name)
    // }

    // for (i in 0..10) { //print 0-10
    //     println(i)
    // }
    // for (i in 0 until 10) { // print 0-9
    //     println(i)
    // }

    // for (i in 10 downTo 1) { // print 10 -1
    //     println(i)
    // }

    // for (index in names.indices){ //print with thecorresponding number
    //     println("${index +1} :  ${names[index]}")
    // }

    var count = 0
    for (i in 1..5) {
        count++
        for (j in 1..count) {
            print(i)                           
        }
        println()
    }
}
