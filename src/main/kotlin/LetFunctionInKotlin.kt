/**
How to Distinguish between Scope Function ?
 * There are two main difference between the scope functions:-

1) The way to refer to the context object and this is done using 'this' keyword or by using 'it' keyword

2) The return value Either 'context object' or the 'lambda result'
 */

/**
    Scope Function 'let'

    Let : if you want to just execute lambda expression on a nullable object and avoid NullPointerEception

    Property 1 : Refer to context object by using 'it'
    Property 2 : The return value is the 'lambda result'

    **** Use 'LET' function to avoid NullPointerException
 */

fun main(){
    val name : String? = "Hello - Developers"

    val stringLength = name?.let{
        println(it.reversed())
        println(it.capitalize())
        println(it.lowercase())
        println(it.uppercase())
        it.length
    }
    println(stringLength)
}