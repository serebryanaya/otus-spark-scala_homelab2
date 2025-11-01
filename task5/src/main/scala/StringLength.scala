import scala.io.StdIn.readLine
import scala.util.Try

object StringLength {

  def main(arg: Array[String]): Unit = {
    while (1 == 1) {
      val arg = getInput
      printLength(arg)
    }
  }

  private def getInput: String = {
    var arg = ""
    while (arg.isEmpty) {
      println("Please enter your text: ")
      arg = readLine()
    }
    arg
  }

  private def printLength(arg: String): Unit = {
    val res = arg.toCharArray.length
    println(s"Your text length: $res symbols (with spaces)!")
  }

}
