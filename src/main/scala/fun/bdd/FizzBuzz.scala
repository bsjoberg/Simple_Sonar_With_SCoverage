package fun.bdd

object FizzBuzz {
  def main(args: Array[String]): Unit = {
    println(countTo(100))
  }

  def countTo(count: Int): String = {
    var countString: String = ""
    for (i <- 1 to count) {
      countString += getResult(i)
      if (i != count)
        countString += " "
    }
    countString
  }

  def getResult(i: Int): Any = {
    if (i % 15 == 0)
      "fizzbuzz"
    else if (i % 3 == 0)
      "fizz"
    else if (i % 5 == 0)
      "buzz"
    else
      i
  }
}
