
object Ex1 {
  def calcSum2(a: Int, b: Int): Int = {
    ???
  }

  def calcSum3(a: Int, b: Int, c: Int): Int = {
    ???
  }

  def calcSumList(l: List[Int]): Int = {
    ???
  }
}

//Try your function
val a = Ex1.calcSum2(1, 2)
println(a)


//Unit Test

import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

Ex1.calcSum2(1, 2) shouldEqual 3
Ex1.calcSum2(25, 30) shouldEqual 55

Ex1.calcSum3(1, 2, 3) shouldEqual 6
Ex1.calcSum3(25, 30, 10) shouldEqual 65

Ex1.calcSumList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldEqual 55
