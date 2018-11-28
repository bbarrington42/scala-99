package top.problems

object P16 {
  /*
  Drop every Nth element from a list.
  Example:
  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
   */

  def drop[A](n: Int, ls: List[A]): List[A] =
    ls.foldRight((List.empty[A], 1)) { case (a, (zl, nl)) => if (nl % n == 0) (zl, nl + 1) else (a :: zl, nl + 1) }._1

}
