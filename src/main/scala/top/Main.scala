package top
import top.problems.P08._
import top.problems.P09._

object Main {

  def main(args: Array[String]): Unit = {

    println(compress(List('a', 'a', 'a', 'b', 'b', 'b', 'b', "c")))

    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
