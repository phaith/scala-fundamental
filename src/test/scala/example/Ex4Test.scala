package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Ex4Test extends AnyFlatSpec with Matchers {
  "multiplyTwo" should "calc a * 2" in {
    Ex4.multiplyTwo(-3) shouldEqual -6
    Ex4.multiplyTwo(4) shouldEqual 8
  }

  "calcList" should "double all values in list" in {
    Ex4.calcList(List(1,2,3,4,5,6,7,8,9,10), _ * 2) shouldEqual List(2,4,6,8,10,12,14,16,18,20)
  }

}
