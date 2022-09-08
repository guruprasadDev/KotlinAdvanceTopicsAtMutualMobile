/**
How to Distinguish between Scope Function ?
 * There are two main difference between the scope functions:-

1) The way to refer to the context object and this is done using 'this' keyword or by using 'it' keyword

2) The return value Either 'context object' or the 'lambda result'
 */

/**
    Scope Function :- 'run'
    Property 1: Refer to context object using 'this'

    Property 2: The return value is the 'Lambda results'

    --> 'run' is combination of 'with' and 'let'

    --> If you want to operate a nullable object and avoid NullPointerException the use 'run'
 */


class Student1   {
    var name : String = "E.Guru Prasad"
    var rollNum : Long = 420026019
    var course : String = "BCA"

}

fun main(){
    val student : Student1? = Student1()

    //here we use the with function
  val bio =  student?.run {
        println("Name of the student : $name")
        println("Roll Number : $rollNum")
        println("Course : $course")
        "Hi, Iam doing Internship at Mutual Mobile Private LTD Company"
    }

    println(bio)
}