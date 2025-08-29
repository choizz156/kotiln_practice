package me.kotiln_practice.HelloWorld

@SinceKotlin("1.1")
public typealias Appendable = java.lang.Appendable
@SinceKotlin("1.1")
public typealias StringBuilder = java.lang.StringBuilder


typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    val employees: EmployeeSet



}

class Employee(var name: String, val id: Int) {

}

