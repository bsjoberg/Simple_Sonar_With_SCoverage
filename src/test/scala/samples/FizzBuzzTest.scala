package samples

import fun.bdd.FizzBuzz
import org.junit.{Assert, Test}

@Test
class FizzBuzzTest {

  @Test
  def fizzWhenDivisableBy3(): Unit = {
    Assert.assertEquals("fizz", FizzBuzz.getResult(3))
    Assert.assertEquals("fizz", FizzBuzz.getResult(6))
  }

  @Test
  def buzzWhenDivisableBy5(): Unit = {
    Assert.assertEquals("buzz", FizzBuzz.getResult(5))
    Assert.assertEquals("buzz", FizzBuzz.getResult(10))
  }

  @Test
  def fizzBuzzWhenDivisableBy15(): Unit = {
    Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(15))
    Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(30))
  }

  @Test
  def returnNumberWhenNotDivisibleBy3_5_15(): Unit = {
    Assert.assertEquals(2, FizzBuzz.getResult(2))
  }

  @Test
  def fizzBuzzUpTo20(): Unit = {
    Assert.assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz",
      FizzBuzz.countTo(20))
  }
}
