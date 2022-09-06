/**
 *
User defined infix function notation :-

It must be member function or extension function
It must accept a single parameter
The parameter must not accept variable number of arguments and must have no default value
It must be marked with infix keyword


 */

fun main(){

    val a =100 add(2000)

    println(a)


}

infix fun Int.add(b:Int) = this + b
