package top
import top.problems.P08._
import top.problems.P09._
import top.problems.P16._
import top.problems.P18._
import top.problems.P19._
import top.problems.P20._
import top.problems.P23._
import top.problems.P26._

object Main {

  def main(args: Array[String]): Unit = {

    println(compress(List('a', 'a', 'a', 'b', 'b', 'b', 'b', 'c')))

    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    println(removeAt(1, List('a, 'b, 'c, 'd)))

    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))

    println(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))

    println(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))
  }
}
