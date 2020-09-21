object Ex2 {
  def findMax2(a: Int, b: Int): Int = {
    ???
  }

  def findMax3(a: Int, b: Int, c: Int): Int = {
    ???
  }

  def findMaxList(l: List[Int]): Int = {
    ???
  }
}

//Try your function
val a = Ex2.findMax2(1, 2)
println(a)


//Unit Test

import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

Ex2.findMax2(2, 5) shouldEqual 5
Ex2.findMax2(20, 7) shouldEqual 20

Ex2.findMax3(3, 7, 2) shouldEqual 7
Ex2.findMax3(10, 2, 30) shouldEqual 30
Ex2.findMax3(3, 2, 1) shouldEqual 3

Ex2.findMaxList(List(1, 2, 3, 10, 4, 5, 6, 7, 8, 9)) shouldEqual 10
Ex2.findMaxList(List(100, 2, 3, 10, 4, 5, 6, 7, 8, 9)) shouldEqual 100
Ex2.findMaxList(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual 9

