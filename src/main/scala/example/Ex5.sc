import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

println("------------------Ex5------------------")

case class User(id: Int, name: String)

def searchById(l: List[User], id: Int): Option[User] = {
  ???
}



println("------------------Try your function------------------")

//val a = searchById(List(User(1, "AAA")), 1)
//println(a)

println("------------------Unit Test------------------")

val l = List(
  User(1, "Jerry"),
  User(2, "Jimmy"),
  User(3, "Kenny"),
  User(4, "Benny"),
  User(5, "Yoda"),
  User(6, "Timmy"),
)
searchById(l, 5) shouldEqual Some(User(5, "Yoda"))
searchById(l, 2) shouldEqual Some(User(2, "Jimmy"))
searchById(l, 0) shouldEqual None