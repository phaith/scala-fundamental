package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Ex3Test extends AnyFlatSpec with Matchers {
  "plus" should "calc a + b" in {
    Ex3.plus(-1, 2) shouldEqual 1
    Ex3.plus(25, 30) shouldEqual 55
  }

  "minus" should "calc a - b" in {
    Ex3.minus(1, 2) shouldEqual -1
    Ex3.minus(55, 15) shouldEqual 40
  }

  "multiply" should "calc a * b" in {
    Ex3.multiply(2, 3) shouldEqual 6
    Ex3.multiply(-4, 5) shouldEqual -20
  }

  "calc" should "calc f(Int, Int):Int" in {
    Ex3.calc(1, 2, _ + _) shouldEqual 3
    Ex3.calc(8, 2, _ / _) shouldEqual 4
    Ex3.calc(8, 2, _ % _) shouldEqual 0
  }

}
