fun main() {
    // Byte: from -128->127, its size is 8-bits or 1-byte
    val ourByte:Byte = 100
    println("Byte: $ourByte")

    // Short: from -32768 to 32767, its size is 16-bits or 2bytes
    val ourShort:Short = 30000
    println("Short: $ourShort")

    // Int: from -2^31 to 2^31-1, its size is 32-bits or 4 bytes
    val ourInteger:Int = 200000000
    println("Int: $ourInteger")

    // Long: from -2^63 to 2^63-1, its size is 64-bits or 8bytes
    val ourLong1:Long = 1000000000000000000
    val ourLong2 = 100L
    println("Long: $ourLong1")
    println("Long: $ourLong2")

    //Double data type
    val ourDouble:Double = 99.99
    println("Double: $ourDouble")

    //Float data type
    val ourFloat1:Float = 99.95f
    val ourFloat2:Float = 99.95F
    println("Float1: $ourFloat1 and Float2: $ourFloat2")

    //If you are not sure what number to store in a variable, use Number data type
    // This will allow you to store any number as your wish

    var ourNumber:Number = 19.2 // first we assign a double data type
    println(ourNumber)
    ourNumber= 100L // then we reassign with long data type
    println(ourNumber)
    ourNumber = 200000 // here, we reassign with integer
    println("Number: $ourNumber")

    // Character data type
    val ourChar = 'A'
    println("Char: $ourChar")

    //Boolean data type
    val ourBoolean1: Boolean = true
    val ourBoolean2: Boolean = false
    println("Boolean1: $ourBoolean1 and Boolean2: $ourBoolean2")

    // String data type
    val ourString:String = "Kotlin Programming Language"
    println("String: $ourString")
}