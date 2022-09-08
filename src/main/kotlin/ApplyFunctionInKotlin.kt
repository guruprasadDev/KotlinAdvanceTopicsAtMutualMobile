/**
How to Distinguish between Scope Function ?
 * There are two main difference between the scope functions:-

1) The way to refer to the context object and this is done using 'this' keyword or by using 'it' keyword

2) The return value Either 'context object' or the 'lambda result'
 */

/**
     Scope function : 'apply'

        Property 1: Refer to context object by using 'this' keyword
          Property 2: the return value is the 'context object'
 */

class Employee1{
    var name : String =""
    var age : Int = 0
    var salary :Double =0.0
    var designation : String = ""

}

fun  main(){
    val emp = Employee1().apply {
        name = "E.Guru Prasad"
        age = 22
        salary = 300000.0
        designation = "Android App Developer at Mutual Mobile Pvt Ltd Company"
    }

    with(emp){
        println("Employee name : $name")
        println("Employee age : $age")
        println("Employee Annul salary : $salary")
        println("Employee designation : $designation")
    }
}

/**
       So this is how we use the APPLY function along with the WITH function in kotlin
 */


