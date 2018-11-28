package top.problems

import scala.util.Random

object P23 {
  /*
  Extract a given number of randomly selected elements from a list.
  Example:
  scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  res0: List[Symbol] = List('e, 'd, 'a)
   */

  def randomSelect[A](n: Int, ls: List[A]): List[A] = {
    def loop(i: Int, as: List[A]): List[A] = {
      if (i == 0) Nil else {
        val x = Random.nextInt(as.length)
        val (front, back) = as.splitAt(x)
        back.head :: loop(i - 1, front ++ back.tail)
      }
    }

    loop(n, ls)
  }
}
