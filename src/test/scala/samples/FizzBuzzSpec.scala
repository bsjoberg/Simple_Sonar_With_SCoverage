package samples

import fun.bdd.FizzBuzz
import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzSpec extends FunSpec {
  describe("Fizz Buzz") {
    it ("should return fizz when divisible by 3") {
      assert("fizz" == FizzBuzz.getResult(3))
      assert("fizz" == FizzBuzz.getResult(6))
    }

    it ("should return buzz when divisible by 5") {
      assert("buzz" == FizzBuzz.getResult(5))
      assert("buzz" == FizzBuzz.getResult(10))
    }

    it ("should return fizzbuzz when divisible 15") {
      assert("fizzbuzz" == FizzBuzz.getResult(15))
      assert("fizzbuzz" == FizzBuzz.getResult(30))
    }

    it ("should return fizz buzz fizzbuzz when counting to 20") {
      assert("1 2 fizz 4 buzz fizz 7 8 fizz buzz " +
        "11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz" == FizzBuzz.countTo(20))
    }
  }

}