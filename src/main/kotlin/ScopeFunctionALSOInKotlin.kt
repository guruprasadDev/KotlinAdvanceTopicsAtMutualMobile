/**
How to Distinguish between Scope Function ?
 * There are two main difference between the scope functions:-

1) The way to refer to the context object and this is done using 'this' keyword or by using 'it' keyword

2) The return value Either 'context object' or the 'lambda result'
 */

 /**
     Scope function 'apply'

        Property1 :- Refer to context object using 'this'
        property1 :- the return value is the 'context object' 'it'
  */

class Person(){

    var name = ""
     var phoneNumber : Long = 0

}

fun main(){
    val person = Person().apply {
        name = "E.Guru Prasad"
        phoneNumber = 9177230603
    }

    with(person){
        println("Existing Name : $name")
        println("Existing Phone number $phoneNumber")
    }
    // Perform some other operation an 'person' object

    person.also {

        it.name = "E.H.Guru Prasad Reddy"
        it.phoneNumber = 7995674395

        println("New Name ${it.name}")
        println("New phone number ${it.phoneNumber}")
    }
}