import scala.io.StdIn.readLine

object Greeting {

  def main(arg: Array[String]): Unit = {
    while (1 == 1) {
      val name = getUserName
      val greeting = makeGreeting(name: String)
      println(greeting)
    }
  }

  private def getUserName: String = {
    var name = ""
    while (name.isEmpty) {
      println("Please enter your name: ")
      name = readLine()
    }
    name
  }

  private def makeGreeting(name: String): String = {
    if (name.isEmpty)
      getUserName: String
    else
      s"Hello, $name!"
  }

}
