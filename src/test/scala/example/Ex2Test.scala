package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Ex2Test extends AnyFlatSpec with Matchers {
  "findMax2" should "find max between a and b" in {
    Ex2.findMax2(2, 5) shouldEqual 5
    Ex2.findMax2(20, 7) shouldEqual 20
  }

  "findMax3" should "sum a + b + c" in {
    Ex2.findMax3(3, 7, 2) shouldEqual 7
    Ex2.findMax3(10, 2, 30) shouldEqual 30
    Ex2.findMax3(3, 2, 1) shouldEqual 3
  }

  "findMaxList" should "sum List(a + b + c + ...)" in {
    Ex2.findMaxList(List(1, 2, 3, 10, 4, 5, 6, 7, 8, 9)) shouldEqual 10
    Ex2.findMaxList(List(100, 2, 3, 10, 4, 5, 6, 7, 8, 9)) shouldEqual 100
    Ex2.findMaxList(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual 9
  }
}
