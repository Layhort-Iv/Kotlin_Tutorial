// 1.
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()
    val res = Array(size){ readLine()!!.toInt()}

    println("Enter the first array's elements")
    val arr1 = Array(size){ readLine()!!.toInt()}

    println("Enter the first array's elements")
    val arr2 = Array(size){ readLine()!!.toInt()}

    for(i in res.indices)
        res[i] = arr1[i] + arr2[i]

    println("Result array : ${res.contentToString()}")
}


// 2.
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()

    println("Enter the array element")
    val arr = Array(size){ readLine()!!.toInt()}

    println("The original array: ${arr.contentToString()}")
    arr.sort()
    println("The sorted array in ascending order: ${arr.contentToString()}")
}


// 3.
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()

    println("Enter the array element")
    val arr = Array(size){ readLine()!!.toInt()}

    println("The original array: ${arr.contentToString()}")
    arr.sortDescending()
    println("The sorted array in ascending order: ${arr.contentToString()}")
}

// 4.
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()

    println("Enter the array element")
    val arr = Array(size){ readLine()!!.toInt()}

    println("The sum of all elements inside the array is: ${arr.sum()}")
    println("The average of the array is: ${arr.average()}")
}

// 6.
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()

    println("Enter the array element")
    val arr = Array(size){ readLine()!!.toInt()}

    println("Enter a number to be searched")
    val num = readLine()!!.toInt()

    println(if(num in arr) "$num is at index ${arr.indexOf(num)}" else "Error 404")
}

// 7.
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()

    println("Enter the array element")
    val numbersArray = Array(size){ readLine()!!.toInt()}

    val oddArray = numbersArray.filter{ it % 2 != 0 }.toTypedArray()
    val evenArray = numbersArray.filter { it%2==0 }.toTypedArray()
    println("The result: ${(oddArray+evenArray).contentToString()}")
}

// 8.
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()

    println("Enter the array element")
    val numbersArray = Array(size){ readLine()!!.toInt()}

    println("Original Array : ${numbersArray.contentToString()}")
    println("Reversed Array : ${numbersArray.reversed()}")
}


//9
fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()

    println("Enter the array element")
    val arr = Array(size){ readLine()!!.toInt()}

    println("The number of odd numbers inside the array is ${arr.count { it%2!=0 }}")
    println("The number of even numbers inside the array is ${arr.count { it%2==0 }}")
}


//10
fun isPrime(n: Int) : Boolean{
    var factor: Int = 0
    for(i in 1..n){
        if(n%i==0)
            factor++
    }
    return factor == 2
}

fun main() {
    println("Enter the array size")
    val size = readLine()!!.toInt()
    var totalPrimeNumber = 0

    println("Enter your array element")
    val myArr = Array(size){ readLine()!!.toInt()}

    for(i in myArr){
        if(isPrime(i))
            totalPrimeNumber++
    }

    println("Total prime numbers : $totalPrimeNumber")
}
