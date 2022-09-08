/**
   How to Distinguish between Scope Function ?
       * There are two main difference between the scope functions:-

                1) The way to refer to the context object and this is done using 'this' keyword or by using 'it' keyword

                2) The return value Either 'context object' or the 'lambda result'
 */

/**
      With :- [Lets us explore a simple and sweet demo of WITH function]

            Return : lambda result

            Context object : this

            --> with : if you want to operate on a non-null object


 */

class Student {
    var name : String = "E.Guru Prasad"
    var rollNum : Long = 420026019
    var course : String = "BCA"

}

fun main(){
    val student = Student()

    //here we use the with function
  val bio : String =  with(student){
        println("Name of the student : $name")
        println("Roll Number : $rollNum")
        println("Course : $course")
       "Hi, Iam doing Internship at Mutual Mobile Private LTD Company"
    }
    println("Student bio : $bio")
}