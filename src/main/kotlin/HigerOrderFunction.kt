/**

 Higher Order Function and Lambda Expression

 Higher Order Function :-
        ->A function which accepts other function as a parameter or return the function.

    Before going higher order function you must understand these two:-
            ->Anonymous Function
            ->Lambda Expression

 Anonymous Function:-

         ->A function with no identifier is called as Anonymous function

         ->Anonymous function means we will not specific any name to the function these functions are called anonymous function

         ->Anonymous functions we can not create as member function we can create as location{one function in side a function is called a local function}

 ->Lambda Expression:-
        ->Lambda expression which return Unit

        ->Lambda expression which return any of the value integer,string etc

 */

fun main(){

    val doSub = fun(a:Int,b:Int){           //Anonymous Function
        println("Subtraction of $a and  $b = ${a-b}")
    }
    doSub(10,20)
    val doMultiPule = {   a:Int,b:Int ->        //Anon  ymous Function
        println("Multiplication of $a and $ $b = ${a*b}")
    }
    doMultiPule(30,20)

    doSum(10,30)

    operations(doSub)

}

fun doSum(a:Int,b:Int){                    //Member Function
    println("Addition of $a and $b = ${a+b}")
}

fun operations(arithmeticOperator: (x:Int,y:Int)->Unit){ //Higher Order Function , accepting function as a Parameter

    arithmeticOperator(5,5)

}


