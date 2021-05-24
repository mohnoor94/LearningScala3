package _000_basics

import scala.io.StdIn


/**
 * - "Scala is able to assert whether certain operations on a value are safe based on its type."
 * - "All values have types"
 * - " Knowing the type of every value (or expression) allows Scala to quickly check the valid and invalid uses of that
 * value, without, for example, having to trace the value's provenance back to its origins."
 * - Scala is a statically-typed langauge.
 * - "It is our goal to write correct software, with fewer bugs, and static invariants, often asserted through types,
 * should be preferred wherever possible."
 * - "we encode statically in types, and having the Scala compiler do the hard work of checking our code."
 * ***
 * "Dynamically-typed languages usually make greater usage of tests, in particular unit tests, to verify the
 * correctness of code. These can provide useful assurances about the code, but do not offer the same guarantees as a
 * static type system: they attempt to verify code by running it with a representative sample of possible runtime
 * states, and comparing the results to expected values, but (unlike types) there is no proof of their correctness."
 * ...
 * "For dynamic values, even within a statically-typed language, tests can still be very useful. It is not always
 * possible or practical to encode enough precision with types to verify a program for all possible inputs. And in
 * many scenarios, unit tests can offer additional confidence that our code does what we intend it to do."
 * ***
 * Read more: https://scala.zone/courses/scala/beginner/concepts/static
 */
object _5_Types extends App {
  // Will not compile because we cannot subtract a string from a number
  // And this is known to Scala compiler! (static-check based on type).

  // 5 - StdIn.readLine()
}
