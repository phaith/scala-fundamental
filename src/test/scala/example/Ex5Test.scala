package example

import example.Ex5.User
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Ex5Test extends AnyFlatSpec with Matchers {
  "searchById" should "search user by id" in {
    val l = List(
      User(1, "Jerry"),
      User(2, "Jimmy"),
      User(3, "Kenny"),
      User(4, "Benny"),
      User(5, "Yoda"),
      User(6, "Timmy"),
    )
    Ex5.searchById(l, 5) shouldEqual Some(User(5, "Yoda"))
    Ex5.searchById(l, 2) shouldEqual Some(User(2, "Jimmy"))
    Ex5.searchById(l, 0) shouldEqual None
  }

}
