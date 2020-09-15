package example

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
  def getCalcMode(mode: Mode):  (Int, Int) => Int = {
    ???
  }

  def calcByMode(a: Int, b: Int, mode: Mode): Int = {
    ???
  }
}