import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter a byte:")
    val byte = reader.nextByte()
    println("Byte: $byte")

    println("Enter a short:")
    val short = reader.nextShort()
    println("Short: $short")

    println("Enter an integer:")
    val integer = reader.nextInt()
    println("Int: $integer")

    println("Enter a long:")
    val long = reader.nextLong()
    println("Long: $long")

    println("Enter a double:")
    val double = reader.nextDouble()
    println("Double: $double")

    println("Enter a float:")
    val float = reader.nextFloat()
    println("Float: $float")

    println("Enter a long:")
    val boolean = reader.nextBoolean()
    println("Boolean: $boolean")

    println("Enter a char:")
    val char = reader.next()[0]
    println("Char: $char")

    println("Enter a string:")
    val string1 = reader.nextLine()
    println("String: $string1")

    println("Enter a string:")
    val string2 = readLine()
    println("String: $string2")
}