object Ex3 {
  def plus(a: Int, b: Int): Int = {
    ???
  }

  def minus(a: Int, b: Int): Int = {
    ???
  }

  def multiply(a: Int, b: Int): Int = {
    ???
  }

  def calc(a: Int, b: Int, f: (Int, Int) => Int): Int = {
    ???
  }

  sealed trait Mode

  case object ModePlus extends Mode

  case object ModeMinus extends Mode

  case object ModeMultiply extends Mode

  //hint: use patten matching
  def getCalcMode(mode: Mode): (Int, Int) => Int = {
    ???
  }

  def calcByMode(a: Int, b: Int, mode: Mode): Int = {
    ???
  }
}

//Try your function
val a = Ex3.plus(1, 2)
println(a)


//Unit Test

import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

Ex3.plus(-1, 2) shouldEqual 1
Ex3.plus(25, 30) shouldEqual 55

Ex3.minus(1, 2) shouldEqual -1
Ex3.minus(55, 15) shouldEqual 40

Ex3.multiply(2, 3) shouldEqual 6
Ex3.multiply(-4, 5) shouldEqual -20

Ex3.calc(1, 2, Ex3.plus) shouldEqual 3
Ex3.calc(8, 2, Ex3.minus) shouldEqual 4
Ex3.calc(8, 2, Ex3.multiply) shouldEqual 0

Ex3.calc(1, 2, _ + _) shouldEqual 3
Ex3.calc(8, 2, _ / _) shouldEqual 4
Ex3.calc(8, 2, _ % _) shouldEqual 0

val plusFunction = Ex3.getCalcMode(Ex3.ModePlus)
plusFunction(-1, 2) shouldEqual 1
plusFunction(25, 30) shouldEqual 55

val minusFunction = Ex3.getCalcMode(Ex3.ModeMinus)
minusFunction(1, 2) shouldEqual -1
minusFunction(55, 15) shouldEqual 40

val multiplyFunction = Ex3.getCalcMode(Ex3.ModeMultiply)
multiplyFunction(2, 3) shouldEqual 6
multiplyFunction(-4, 5) shouldEqual -20

Ex3.calcByMode(-1, 2, Ex3.ModePlus) shouldEqual 1
Ex3.calcByMode(25, 30, Ex3.ModePlus) shouldEqual 55

Ex3.calcByMode(1, 2, Ex3.ModeMinus) shouldEqual -1
Ex3.calcByMode(55, 15, Ex3.ModeMinus) shouldEqual 40

Ex3.calcByMode(2, 3, Ex3.ModeMultiply) shouldEqual 6
Ex3.calcByMode(-4, 5, Ex3.ModeMultiply) shouldEqual -20
