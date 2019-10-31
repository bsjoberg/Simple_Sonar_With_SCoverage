package samples

import org.junit._
import Assert._
import fun.bdd.App

@Test
class AppTest {

    @Test
    def testOK(): Unit = assertTrue(true)

    @Test
    def testFoo(): Unit = {
        var z = new Array[String](1)
        z(0) = "bar"
        assertEquals("bar", App.foo(z))
    }

    @Test
    def sayHi(): Unit = {
        assertEquals("Hello World!", App.sayHi)
    }
}


