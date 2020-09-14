package example

object Ex5 {

  case class User(id: Int, name: String)

  def findById(l: List[User], id: Int): Option[User] = ???

}