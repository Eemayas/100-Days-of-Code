/** You can edit, run, and share this code. play.kotlinlang.org */
fun main() {
    var userName: String = "Prashant"
    val popcorn = 5 // There are 5 boxes of popcorn
    val hotdog = 7 // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue

    // Some customers leave the queue
    customers = 8
    println(customers)
    // 8
    println("Hello $userName")

    val str = "abcd 123"
    for (c in str) {
        println(c)
    }
    // Escaped strings
    val s = "Hello, world!\n"

    // Multiline strings
    val text = """
    for (c in "foo")
        print(c)
"""
    val text1 =
        """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """
            .trimMargin()
    // will print
    // Tell me and I forget.
    // Teach me and I remember.
    // Involve me and I learn.
    // (Benjamin Franklin)

    print(text1)

    // Formats to add zeroes and make a length of seven
    val integerNumber = String.format("%07d", 31416)
    println(integerNumber)
    // 0031416

    // Formats with four decimals and sign
    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber)
    // +3.1416

    // Formats with uppercase for two placeholders
    val helloString = String.format("%S %S", "hello", "world")
    println(helloString)
    // HELLO WORLD
}
