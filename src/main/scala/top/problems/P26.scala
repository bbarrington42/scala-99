package top.problems

object P26 {
  /*
   Generate the combinations of K distinct objects chosen from the N elements of a list.
  In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
  Example:

  scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
   */


  def combinations[A](n: Int, ls: List[A]): List[List[A]] = {
    def combine(i: Int, acc: List[List[A]]): List[List[A]] = {
      if (i == 0) acc else {
        val x = for {
          as <- acc
          a <- ls.filterNot(as.contains(_))
        } yield a :: as
        combine(i-1, x)
      }
    }

    combine(n, List(Nil))
  }
}
