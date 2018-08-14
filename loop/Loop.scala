object Loop {

  def loop1To9_while(){
    var i = 0
    while(i < 10) {
      i = i + 1
      println(i)
    }
  }

  def loop1To9_dowhile() {
    var i = 0;
    do {
     i = i + 1
     println(i)
    } while(i < 10)
  }

  def loop1To9_for() {
    for (i <- 1 to 10 ) {
      println(i);
    }
  }

  def printNineNineTable() {
    for (x <- 1 to 9; y <- 1 until 10) {
      println(x+"*"+y+"="+x*y);
    }
  }

  def printNineNineTable(i:Int) {
    for (x <- 1 to 9; y <- 1 to 9 if x < i) { 
      println(x+"*"+y+"="+x*y);
    }
  }

  def printFruits {
    for (e <- List("Apple", "Banana", "Cinammon")) {
      println(e)
    }
  }
}
