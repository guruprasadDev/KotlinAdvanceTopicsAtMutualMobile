/**
 Reflection in kotlin [::]
        Reflection is a set of language and library features that allows to introspect the structure of your program at runtime
 */


class ReflectionInKotlin{

}

fun isEven(x:Int) = x%2==0

fun main(){
    val myList = listOf(1,2,3,4,5,6,7,8,9,10)
    myList.filter(::isEven).forEach(::println)

    val abc = ReflectionInKotlin::class
    println("This a class reflection $abc")

    val obj = ReflectionInKotlin()
    println("these is bounded class reflection $obj")

}