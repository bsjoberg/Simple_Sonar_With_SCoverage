package samples

import fun.bdd.FizzBuzz
import org.scalatest.{FeatureSpec, GivenWhenThen}

class FizzBuzzFeatureSpec extends FeatureSpec with GivenWhenThen {
  feature("FizzBuzz counter") {
    scenario("FizzBuzz can print to a user defined number") {
      Given("A FizzBuzz application")

      When("the user specifies a count to 15")
      val messageFromFizzBuzzCounter = FizzBuzz.countTo(15)

      Then("I expect a message that counts in fizz buzz to 15")
      assert("1 2 fizz 4 buzz fizz 7 8 fizz buzz " +
        "11 fizz 13 14 fizzbuzz" == messageFromFizzBuzzCounter)
    }
  }
}
