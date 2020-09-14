package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Ex1Test extends AnyFlatSpec with Matchers {
  "calcSum2" should "sum a + b" in {
    Ex1.calcSum2(1, 2) shouldEqual 3
    Ex1.calcSum2(25, 30) shouldEqual 55
  }

  "calcSum3" should "sum a + b + c" in {
    Ex1.calcSum3(1, 2, 3) shouldEqual 6
    Ex1.calcSum3(25, 30, 10) shouldEqual 65
  }

  "calcSumList" should "sum List(a + b + c + ...)" in {
    Ex1.calcSumList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldEqual 55
  }
}
