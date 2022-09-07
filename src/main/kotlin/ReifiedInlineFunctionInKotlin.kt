/**
 * -> Reified is a special keyword that helps kotlin developer to access Information related class at runtime
 *
 * -> Reified can only be used with inline function
 *
 * -> The generic type T will be assigned to the type of the value it gets as an argument
 */
inline fun <reified T> myFunction(name : T) {

    println("\n name of your car -> $name")
    println("\n Type of myClass : ${T::class.java}")

}
fun main(){
    myFunction("E.Guru Prasad Reddy")

    myFunction(100)

    myFunction('A')

    myFunction(10L)

    myFunction(1.5)

    myFunction(1.5f)

    myFunction(true)
}