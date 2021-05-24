package _000_basics

/**
 * - IntegerNumbers: Long, Int, Short and Byte.
 * - Floating-Point Nunbers: Float, and Double.
 * ***
 * Read more: https://scala.zone/courses/scala/beginner/concepts/floatingpoint
 */
object _06_Numbers extends App {
  val a = 5: Byte // 8-bit signed integer
  val b = 5: Short // 16-bit signed integer
  val c = 5: Int // 32-bit signed integer
  val d = 5: Long // 64-bit signed integer

  val e = 3.5: Float // 32-bit floating-point number
  val f = 3.5: Double // 64-bit floating-point number


  // We will explain f-strings which used inside the next println statements later
  // Or, for instance,look for refer to String Interpolation online.
  println(f"Byte.MaxValue = ${Byte.MaxValue}")
  println(f"Byte.MinValue = ${Byte.MinValue}")
  println("=" * 50)

  println(f"Short.MaxValue = ${Short.MaxValue}")
  println(f"Short.MinValue = ${Short.MinValue}")
  println("=" * 50)

  println(f"Int.MaxValue = ${Int.MaxValue}")
  println(f"Int.MinValue = ${Int.MinValue}")
  println("=" * 50)

  println(f"Long.MaxValue = ${Long.MaxValue}")
  println(f"Long.MinValue = ${Long.MinValue}")
  println("=" * 50)

  println(f"Float.MaxValue = ${Float.MaxValue}")
  println(f"Float.MinValue = ${Float.MinValue}")
  println("=" * 50)

  println(f"Double.MaxValue = ${Double.MaxValue}")
  println(f"Double.MinValue = ${Double.MinValue}")
  println("=" * 50)
  println("=" * 50)
  println("=" * 50)


  println(f"Float.NaN = ${Float.NaN}")
  println(f"Float.MinPositiveValue = ${Float.MinPositiveValue}")
  println(f"Float.NegativeInfinity = ${Float.NegativeInfinity}")
  println(f"Float.PositiveInfinity = ${Float.PositiveInfinity}")
  println("=" * 50)

  println(f"Double.NaN = ${Double.NaN}")
  println(f"Double.MinPositiveValue = ${Double.MinPositiveValue}")
  println(f"Double.NegativeInfinity = ${Double.NegativeInfinity}")
  println(f"Double.PositiveInfinity = ${Double.PositiveInfinity}")
  println("=" * 50)
  println("=" * 50)
  println("=" * 50)

  println(f"Double.PositiveInfinity == Double.PositiveInfinity ::: ${Double.PositiveInfinity == Double.PositiveInfinity}")
  println(f"Double.NegativeInfinity == Double.NegativeInfinity ::: ${Double.NegativeInfinity == Double.NegativeInfinity}")
  println(f"Double.PositiveInfinity == Double.NegativeInfinity ::: ${Double.PositiveInfinity == Double.NegativeInfinity}")
  println("=" * 50)

  println(f"Double.NaN == Double.NaN ::: ${Double.NaN == Double.NaN}")
  println(f"Double.MaxValue * 2 / 2 ::: ${Double.MaxValue * 2 / 2}")
  println("=" * 50)
}
