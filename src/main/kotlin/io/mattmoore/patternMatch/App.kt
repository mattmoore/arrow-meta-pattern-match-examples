package io.mattmoore.patternMatch

//metadebug

data class Company(val name: String)
data class Person(val firstName: String, val lastName: String, val company: Company)

fun patmat(): Unit {
  val person = Person("Matt", "Moore", Company("Rally"))

  fun getFirstName(person: Person) = person.firstName

  println("Printing first name: ${getFirstName(person)}")

  when (person) {
    Person(_, "Moore", Company("Rally")) -> println("Matched!")
//    Person(person.firstName, "Moore", Company("Rally")) -> println("Matched!")
//    case Person[firstName, lastName] where { firstName == "Matt" } -> println("Worked!")
  }
//  val Person(_, lastName) = person
}

fun main(args: Array<String>) {
  patmat()
}
