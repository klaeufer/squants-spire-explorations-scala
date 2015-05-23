import spire.implicits._
import spire.math._
import scala.util.Try

{
  val r1 = Rational(2, 4)
  assert(1 == r1.numerator)
  assert(2 == r1.denominator)

  val r2 = Rational(-3, 6)
  assert(-1 == r2.numerator)
  assert(2 == r2.denominator)

  val r3 = Rational(-3, -6)
  assert(1 == r3.numerator)
  assert(2 == r3.denominator)

  val r4 = Try(Rational(1, 0))
  assert(r4.isFailure)
}

{
  val r1 = Rational(47, 64)
  val r2 = Rational(-11, 64)

  assert(r1 + r2 == Rational(36, 64))
  assert(r1 - r2 == Rational(58, 64))
  assert(r1 * r2 == Rational(47 * -11, 64 * 64))
  assert(r1 / r2 == Rational(47, -11))
  assert(r2.reciprocal == Rational(64, -11))
  assert(-r2 == Rational(11, 64))
}

{
  val r1 = Rational(-3, 6)
  val r2 = Rational(2, 4)
  val r3 = Rational(1, 2)
  assert(r1 < r2)
  assert(r1 <= r2)
  assert(r2 > r1)
  assert(r2 >= r1)
  assert(r2 == r3)
  assert(r2 <= r3)
  assert(r3 >= r2)
}
