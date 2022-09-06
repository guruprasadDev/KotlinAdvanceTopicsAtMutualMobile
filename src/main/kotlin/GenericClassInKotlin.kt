class Employee<T>(var employeeId: T){

    val employee:T = employeeId

    init{
        this.employeeId=employeeId
        println("Employee Id $employeeId")
    }
}

fun main(){
    val employee = Employee<Int>(7896)
    val employee1 = Employee<String>("7896")
    val employee2 = Employee<Float>(7896.0f)
    val employee3 = Employee<Double>(7896.0)
    val employee4 = Employee<Long>(7896L)

}
