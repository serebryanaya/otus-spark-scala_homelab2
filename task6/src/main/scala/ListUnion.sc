def getUnionString(list: List[String]) : String = {
    list.filter(_.trim.nonEmpty).mkString(" ")
}

val list = List("123", " ", "hello", "", "привет")
getUnionString(list)