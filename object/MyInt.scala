class MyInt(private var x:Int) {
  def +(_x:Int) = {
    val r = x+_x
    x = r
    r
  }
  def ++ = {
    x = x + 1
    x
  }
}

class MyInt2(val x:Int) {
  def +(_x:Int) = new MyInt2(x+_x)
  def ++ = new MyInt2(x+1)
  override def toString = x.toString
}
