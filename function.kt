fun main(args: Array<String>) {
    println(greet("eric")

) 
}
fun add(num1: Int, num2: Int): Int{

    return num1 + num2
}
fun greet(user: String): String{

    var say = if (user.equals("eric")) "hello" else "hi"
    
    return say
}