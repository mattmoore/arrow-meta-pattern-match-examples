```kotlin
package arrow.meta.plugins.proofs
​
val `_`: Nothing =
  TODO("Compiler replaces this for ::identity in each position") // Don't care
​
object case {
  infix operator fun <A> invoke(a: A): A = `_`
  infix operator fun <A, B> invoke(pair: Pair<A, B>): Pair<A, B> = `_`
  infix operator fun <A, B, C> invoke(triple: Triple<A, B, C>): Triple<A, B, C> = `_`
}
​
infix fun <A> A.where(f: A.() -> Boolean): A = `_`
​
data class Person(val id: Long, val name: String)
​
@Suppress("UNRESOLVED_REFERENCE", "UNDERSCORE_USAGE_WITHOUT_BACKTICKS") //allows y and gets you until analysis:
//Couldn't find descriptor for 'y'
fun main() {
  val subject = Person(0, "Jane")
  val result =
    when (subject) {
      case(Person(_, y)) where { y == "Jane" } -> true
      else -> false
    }
  println(result) // should print true
}
```
