object Match {
  def _printPrice(item:String) {
    val price:Int = item match {
      case "dog"|"cat" => 1000
      case "snake" => 2000
      case "ham" => 3000
      case _ => 0
    }
    println(price);
  }

  def printPrice(item:String) {
   val priceList = List("dog", List("aaa", 1000),
                        "cat", List("bbb", 2000),
                        "snake", List("ccc", 3000))
   priceList match {
     case List(kind@List(item), x) =>
       println(kind);
     case _ => ()
   }


  }

  def printListTest() {
   val list = List("A", "B", "C")
   list match {
     case List("A",b,c) if b == "B" => println("A")
     case List("B",arg1) => println(arg1)
     case _ => ()
   }
  }

}
