import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

println("------------------Ex1------------------")

def calcSum2(a: Int, b: Int): Int = {
  ???
}

def calcSum3(a: Int, b: Int, c: Int): Int = {
  ???
}

def calcSumList(l: List[Int]): Int = {
  ???
}


println("------------------Try your function------------------")

//val a = calcSum2(1, 2)
//println(a)

println("------------------Unit Test------------------")

calcSum2(1, 2) shouldEqual 3
calcSum2(25, 30) shouldEqual 55

calcSum3(1, 2, 3) shouldEqual 6
calcSum3(25, 30, 10) shouldEqual 65

calcSumList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldEqual 55
