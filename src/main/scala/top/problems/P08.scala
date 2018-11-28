package top.problems

object P08 {
  /*
  Eliminate consecutive duplicates of list elements.
  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  Example:

  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
   */
  def compress[T](ls: List[T]): List[T] =
    ls.foldRight(List.empty[T])((t, z) => if (z.isEmpty || t != z.head) t :: z else z)

}
