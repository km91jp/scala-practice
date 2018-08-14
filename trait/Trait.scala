trait TraitA {
  def a:Unit = {
    val s = 'name
    val s2 = 'name
    println(s.name)
    println(if (s == s2) "s == s2" else "s != s2")
  }
}
trait TraitB {
  def b:Unit = {
    val s = "name"
    val s2 = "name"
    println(s)
    println(if (s == s2) "s == s2" else "s != s2")
  }
}

trait TraitC {
  def b {
    println("b")
  }
  def d
}

class Main extends TraitA with TraitB with TraitC {
  override def b = super[TraitC].b
  override def d = println("d")
  def exec = {
    a
    b
    d
  }
}
object Main {
  def main(args:Array[String]) {
    val m = new Main
    m.exec
  }
}
