package top

object Main {

  def compress2[T](l: List[T]): List[T] = l match {
    case Nil => Nil
    case head :: tail =>
      if (tail.isEmpty || head != tail.head) head :: compress(tail) else compress(tail)
  }

  def compress[T](ls: List[T]): List[T] =
    ls.foldRight(List.empty[T])((t, z) => if (z.isEmpty || t != z.head) t :: z else z)

  def main(args: Array[String]): Unit = {
    val l = List('a', 'a', 'a', 'b', 'b', 'b', 'b', "c")

    println(compress(l))
  }
}
