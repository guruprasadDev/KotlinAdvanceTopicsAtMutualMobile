fun  main(){

    val arrayListString : ArrayList<String> = arrayListOf("Guru","Vishnu")
    val s :String = arrayListString[0]
    println("ArrayList string value $s")
    printValue(arrayListString)

    val arrayListFloat : ArrayList<Float> = arrayListOf(100f,300f,400.0f)
    printValue(arrayListFloat)

}

fun <T> printValue(list: ArrayList<T>) {

    for(generics in list){
        println("")
        println(generics)
    }

}
