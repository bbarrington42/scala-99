package top.problems

object P09 {
  /*
  Pack consecutive duplicates of list elements into sublists.
  If a list contains repeated elements they should be placed in separate sublists.
  Example:

  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
   */

  def pack[A](ls: List[A]): List[List[A]] = ls match {
    case Nil => Nil

    case head :: tail =>
      val (packed, next) = tail span (_ == head)
      (head :: packed) :: pack(next)
  }
}
