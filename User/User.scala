class User(val name:String, val age:Int)

object User {
  def printUser(user: User) {
    println("User:"+user.name+"("+user.age+")")
  }

  def isSchoolStarted(user: User) =
    if (user.age >= 6) {
      "幼児はありません"
    } else {
      "幼児です"
    }

  def printIfSchoolStarted(user:User) {
    if (user.age >= 6 ) {
      println("幼児ではありません")
    }
  }

}
