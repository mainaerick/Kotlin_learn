fun main(args: Array<String>) {
    for (i in 1..10) {
        val prefix = if (i ==1 ) "hello" else if(i in 4..7) "whatever" else "hi"

        println("$i $prefix ")
        // if (i==3) continue

        // println(i)
    }


   
}