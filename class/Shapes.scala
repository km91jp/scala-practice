package Shapes
abstract class Line(val x:Int, val y:Int) {
 private[Shapes] def length:Int = if (x-y>=0) x-y else y-x
}

package Triangle {
  class Triangle(x:Int, y:Int, val z:Int) extends Line(x,y) {
    def lengthXY:Int = length
    def area:Int = {
      val s:Double = (x+y+z)/2
      Math.floor(Math.sqrt(s*(s-x)*(s-y)*(s-z))).toInt
    }
  }
}

package Tetragon {
  import Shapes.Triangle.{Triangle => Tr}
  class Tetragon(w:Int, x:Int, y:Int, z:Int) extends Tr(w,x,y) {
    override def area:Int = 100 //dummy
  }
}
