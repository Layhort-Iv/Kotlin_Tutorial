import java.util.*

fun main(a:Array<String>) {

    var name:String
    var s = Scanner(System.`in`)
/* println("Input your name: ")
name = s.next()
println("Enter number of times:")
var num = s.nextInt()

for(i in 1..num){
println(name)
}*/

/*for(i in 0..10 step 3){
println(i)
}
*/

/*for(i in 10 downTo 0 step 11){
println(i)
}*/

    for(i in 1..5){ // i = 0,1
        for(j in 1..5){ //j = 0,1,2,3,4,5
            print(j)
        }
        println()
    }
}