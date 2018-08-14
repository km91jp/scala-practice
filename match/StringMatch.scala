object StringMatch {

  def print {
    val list = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
    list match {
      case List(a,b,c,d,e) if a == e  => println(a,b,c,d,e)
      case _ => ()
    }
  }

}
