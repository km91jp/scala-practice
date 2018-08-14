import Point3D._
import Shapes.Triangle.Triangle
import Shapes._
object Main {
 def main(args:Array[String]) {
  val p = new Point3D(10,20,30)
  println(p.x)
  println(p.y)
  println(p.z)
  /* private[this] Point3D class only */
  //p.debug
  /* protected (Point3D's subclass or Point3D package only */
  //p.print
  /* public */
  p.point
  val pEx = new Point3DEx(10,20,30)
  pEx.point
  val t = new Triangle(10,20,30)
  /* private[Shapes]: Shapes package private */
  //println(t.length)
  println(t.lengthXY)
  println(t.area)
 }
}
