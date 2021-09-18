fun main() {
    val names: Array<String> = arrayOf("erick", "maina", "ndungu")

    names.set(names.lastIndex, "wanjiku")
    println(names.last()) // display last element in the array
}
