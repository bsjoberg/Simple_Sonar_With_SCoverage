package fun.bdd

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]): String = x.foldLeft("")((a,b) => a + b)

  def sayHi: String = "Hello World!"

  def main(args : Array[String]) {
    println( sayHi )
    println("concat arguments = " + foo(args))
  }

}
