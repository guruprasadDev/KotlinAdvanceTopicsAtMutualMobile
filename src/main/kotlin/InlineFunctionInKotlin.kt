/**
  Inline Function

 -> Inline function declare with a keyword called Inline
 -> The use of inline function enhances the performance of higher order function
 -> the inline function tells the compiler to copy the parameter and function to the call site

 */

fun main(){
    inlineFunction { println("Calling the inline function") }
}

inline fun inlineFunction(fu: ()-> Unit){
    fu()
    println("Code inside the inline function")
}

/**
 What is the difference between normal function and Inline function ?

 So Basically what kotlin does  internally creates separate  Instance and class for every lambda we have created

 the inline function tells the compiler to copy the parameter and function to the call site
 */