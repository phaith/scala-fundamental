import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

println("------------------EX4------------------")

def multiplyTwo(a: Int): Int = {
  ???
}

def calcList(l: List[Int], f: Int => Int): List[Int] = {
  ???
}


println("------------------Try your function------------------")

//val a = multiplyTwo(1)
//println(a)

println("------------------Unit Test------------------")

multiplyTwo(-3) shouldEqual -6
multiplyTwo(4) shouldEqual 8

calcList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), _ * 2) shouldEqual List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
