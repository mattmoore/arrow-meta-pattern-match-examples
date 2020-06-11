package io.mattmoore.patternMatch

//metadebug

data class Company(val name: String)
data class Person(val firstName: String, val lastName: String, val company: Company)

fun case(arg: Any?): Any? = arg

fun main(args: Array<String>) {
  val person = Person("Matt", "Moore", Company("Rally"))

  when (person) {
    case(Person(_, "Moore", Company("Rally"))) -> println("Person match")
//    Person(person.component1(), "Moore", Company("Rally")) -> println("Person match")
//    case([_, "Matt"]) -> println("Array match")
  }
}
