{
  val seq = (1 to 5).toList

  def incrementInt(list: List[Int]): List[Int] = {
    list.map(_ + 1)
  }

  println(incrementInt(seq))
}

