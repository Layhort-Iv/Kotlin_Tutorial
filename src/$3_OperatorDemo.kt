fun main() {
    val a = -12
    val b = 12

    // use of greater than operator
    val max = if (a > b) {
        println("A is greater than B")
        a
    } else {
        println("B is greater than A")
        b
    }

    println("Max = $max")
//    val numbers = intArrayOf(10,2,4,6)
//    for(i in 0..4){ //0,1,2,3,4
//        println(numbers[i])
//    }

//    for(i in numbers){
//        println(i)
//    }

    // for i in range(0,4)
    // for i in numbers
//    greeting("Sam Smith")
}

fun greeting(name:String){
    println(name)
}