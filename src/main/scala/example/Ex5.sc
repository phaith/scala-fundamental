

object Ex5 {

  case class User(id: Int, name: String)

  def searchById(l: List[User], id: Int): Option[User] = {
    ???
  }

}

//Try your function
val a = Ex5.searchById(List(Ex5.User(1, "AAA")), 1)
println(a)


//Unit Test

import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

val l = List(
  Ex5.User(1, "Jerry"),
  Ex5.User(2, "Jimmy"),
  Ex5.User(3, "Kenny"),
  Ex5.User(4, "Benny"),
  Ex5.User(5, "Yoda"),
  Ex5.User(6, "Timmy"),
)
Ex5.searchById(l, 5) shouldEqual Some(Ex5.User(5, "Yoda"))
Ex5.searchById(l, 2) shouldEqual Some(Ex5.User(2, "Jimmy"))
Ex5.searchById(l, 0) shouldEqual None