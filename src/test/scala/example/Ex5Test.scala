package example

import example.Ex5.User
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Ex5Test extends AnyFlatSpec with Matchers {
  "findById" should "find user by id" in {
    val l = List(
      User(1, "Jerry"),
      User(2, "Jimmy"),
      User(3, "Kenny"),
      User(4, "Benny"),
      User(5, "Yoda"),
      User(6, "Timmy"),
    )
    Ex5.findById(l, 5) shouldEqual User(5, "Yoda")
    Ex5.findById(l, 2) shouldEqual User(2, "Jimmy")
  }

}
