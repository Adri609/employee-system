abstract class Employee (
    val name: String,
    val salary: Double
){
    abstract fun work()
    abstract fun calculateAnualBonus()

    fun details() {
        println("Name: $name, Salary: $salary")
    }
}