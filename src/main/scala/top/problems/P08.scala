package top.problems

object P08 {

  def compress[T](ls: List[T]): List[T] =
    ls.foldRight(List.empty[T])((t, z) => if (z.isEmpty || t != z.head) t :: z else z)

}
