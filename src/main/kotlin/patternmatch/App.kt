package patternmatch

data class Person(val firstName: String, val lastName: String)
val person = Person("Matt", "Moore")

fun main(args: Array<String>) {
  val (_, lastName) = person
  println("Hi")
}
