import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

println("------------------Ex2------------------")

def findMax2(a: Int, b: Int): Int = {
  ???
}

def findMax3(a: Int, b: Int, c: Int): Int = {
  ???
}

def findMaxList(l: List[Int]): Int = {
  ???
}


println("------------------Try your function------------------")

//val a = findMax2(1, 2)
//println(a)

println("------------------Unit Test------------------")

findMax2(2, 5) shouldEqual 5
findMax2(20, 7) shouldEqual 20

findMax3(3, 7, 2) shouldEqual 7
findMax3(10, 2, 30) shouldEqual 30
findMax3(3, 2, 1) shouldEqual 3

findMaxList(List(1, 2, 3, 10, 4, 5, 6, 7, 8, 9)) shouldEqual 10
findMaxList(List(100, 2, 3, 10, 4, 5, 6, 7, 8, 9)) shouldEqual 100
findMaxList(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual 9

