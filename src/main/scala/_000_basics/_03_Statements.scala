package _000_basics

/**
 * "Every expression which does not throw an exception must return a single value, so a println expression will return
 * the unit value, which we write as (). There is virtually nothing interesting that can be done with the value (),
 * but it exists in order to maintain the invariant that every expression returns a value. Nevertheless, expressions
 * which return () are a special kind of expression called a statement.
 * The invariant that all expressions must return a value means that we can treat statements like other expressions."
 * ...
 * "There is only one unit value, which means that every statement returns the same value, regardless of what it does.
 * The "interesting" action of statements is not in their return value, but in the side-effects they produce."
 * ***
 * Read more: https://scala.zone/courses/scala/beginner/foundations/expressions
 */
object _03_Statements extends App {
  // 4 + 9 is an expression which produce 13 as a value
  // println(4 + 9) => println(13) is an expression itself which produce () as a value
  // This special expression (which return the unit value()) can be called a statment
  // println(4 + 9) => println(13) will prints 13 to the console as a side effect
  println(4 + 9)
}
