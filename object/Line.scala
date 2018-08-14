class Line(val x:Int, val y:Int) {
  private[this] def _length = println(x,y)
  private def length = _length
}
object Line {
  def apply(x:Int, y:Int):Line = new Line(x,y)
  def test = {
  val l = Line(1,2)
  l.length
  /* cannot access */
  //l._length
  }
}
