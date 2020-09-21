

object Ex4 {
  def multiplyTwo(a: Int): Int = {
    ???
  }

  def calcList(l: List[Int], f: Int => Int): List[Int] = {
    ???
  }
}

//Try your function
val a = Ex4.multiplyTwo(1)
println(a)


//Unit Test

import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

Ex4.multiplyTwo(-3) shouldEqual -6
Ex4.multiplyTwo(4) shouldEqual 8

Ex4.calcList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), _ * 2) shouldEqual List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
