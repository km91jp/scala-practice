package Point3D
class Point3D(val x:Int, val y:Int, val z:Int) {
 private[this] def debug = println(x,y,z)
 protected def print = debug
 def point = {
   debug
 }
}

class Point3DEx(x:Int, y:Int, z:Int) extends Point3D(x,y,z) {
 override def point = {
   print
 }
}
