object PartialFunction {
  def main(args: Array[String]): Unit = {
    val f1 : PartialFunction[Int,String] = {
      case x if x > 0 => " x > 0"
    }

    val f2 : PartialFunction[Int,String] = {
      case x if x == 0 => " x == 0"
    }

    val f3 : PartialFunction[Int,String] = {
      case x if x < 0 && x >= -10 => " -10 <= x < 0"
    }

    var f : (Int => String) = f1 orElse f2 orElse f3 orElse {case _ => " other "}

    println(f(-11))
  }
}
