import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

println("------------------Ex3------------------")

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


println("------------------Try your function------------------")

//val a = plus(1, 2)
//println(a)

println("------------------Unit Test------------------")

plus(-1, 2) shouldEqual 1
plus(25, 30) shouldEqual 55

minus(1, 2) shouldEqual -1
minus(55, 15) shouldEqual 40

multiply(2, 3) shouldEqual 6
multiply(-4, 5) shouldEqual -20

calc(1, 2, plus) shouldEqual 3
calc(8, 2, minus) shouldEqual 4
calc(8, 2, multiply) shouldEqual 0

calc(1, 2, _ + _) shouldEqual 3
calc(8, 2, _ / _) shouldEqual 4
calc(8, 2, _ % _) shouldEqual 0

val plusFunction = getCalcMode(ModePlus)
plusFunction(-1, 2) shouldEqual 1
plusFunction(25, 30) shouldEqual 55

val minusFunction = getCalcMode(ModeMinus)
minusFunction(1, 2) shouldEqual -1
minusFunction(55, 15) shouldEqual 40

val multiplyFunction = getCalcMode(ModeMultiply)
multiplyFunction(2, 3) shouldEqual 6
multiplyFunction(-4, 5) shouldEqual -20

calcByMode(-1, 2, ModePlus) shouldEqual 1
calcByMode(25, 30, ModePlus) shouldEqual 55

calcByMode(1, 2, ModeMinus) shouldEqual -1
calcByMode(55, 15, ModeMinus) shouldEqual 40

calcByMode(2, 3, ModeMultiply) shouldEqual 6
calcByMode(-4, 5, ModeMultiply) shouldEqual -20
