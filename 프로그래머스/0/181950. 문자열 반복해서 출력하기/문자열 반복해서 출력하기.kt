fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val str = input[0]
    val n = input[1].toInt()

    val result = str.repeat(n)
    println(result)
}