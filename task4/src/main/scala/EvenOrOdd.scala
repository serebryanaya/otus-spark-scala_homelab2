import scala.io.StdIn.readLine
import scala.util.Try

object EvenOrOdd {

  def main(arg: Array[String]): Unit = {
    while (1 == 1) {
      val number = getInput
      printEvenOrOdd(number)
    }
  }

  private def getInput: Integer = {
    var number: Option[Int] = None
    while (number.isEmpty) {
      print("Please enter your number: ")
      Try(readLine().trim.toInt).toOption match {
        case Some(n) => number = Some(n)
        case None => println("Invalid input")
      }
    }
    number.get
  }

  private def printEvenOrOdd(number: Int): Unit = {
    val res = if (number % 2 != 0) "odd" else "even"
    println(s"Number $number is $res!")
  }

}
