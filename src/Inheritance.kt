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
