import Utils._
import Line.{test => ltest}
object Main {
  def main(args:Array[String]){
    a
    Utils.b
    ltest
    val m = new MyInt(3)
    println(m+3)
    println(m++)
    val m2 = new MyInt2(3)
    println(m2+3)
    println(m2++)
  }
}
