package example

import com.sun.org.apache.xpath.internal.operations.Plus
import example.Ex3.{ModeMinus, ModeMultiply, ModePlus}
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
    Ex3.calc(1, 2, Ex3.plus) shouldEqual 3
    Ex3.calc(8, 2, Ex3.minus) shouldEqual 4
    Ex3.calc(8, 2, Ex3.multiply) shouldEqual 0

    Ex3.calc(1, 2, _ + _) shouldEqual 3
    Ex3.calc(8, 2, _ / _) shouldEqual 4
    Ex3.calc(8, 2, _ % _) shouldEqual 0
  }

  "getCalcMode" should "return calc function" in {
   val plusFunction = Ex3.getCalcMode(ModePlus)
    plusFunction(-1, 2) shouldEqual 1
    plusFunction(25, 30) shouldEqual 55

    val minusFunction = Ex3.getCalcMode(ModeMinus)
    minusFunction(1, 2) shouldEqual -1
    minusFunction(55, 15) shouldEqual 40

    val multiplyFunction = Ex3.getCalcMode(ModeMultiply)
    multiplyFunction(2, 3) shouldEqual 6
    multiplyFunction(-4, 5) shouldEqual -20
  }

  "calcByMode" should "calcByMode f(Int, Int):Int" in {
    Ex3.calcByMode(-1,2,ModePlus)  shouldEqual 1
    Ex3.calcByMode(25, 30,ModePlus) shouldEqual 55

    Ex3.calcByMode(1,2,ModeMinus) shouldEqual -1
    Ex3.calcByMode(55, 15,ModeMinus) shouldEqual 40

    Ex3.calcByMode(2, 3,ModeMultiply) shouldEqual 6
    Ex3.calcByMode(-4, 5,ModeMultiply) shouldEqual -20
  }

}
