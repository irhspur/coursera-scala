package week5

object ListReduction {

  val nums = List(2, -4, 5, 7, 1)
  val fruits = List("apple", "pineapple", "orange", "banana")
  val data = List("a", "a", "a", "b", "c", "c", "a")

	def main(args: Array[String]) = {

//    squareListTest()
//    filterTest()
//    packTest()
    println(lengthFun(nums))
	}

  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())( ??? )

  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)( ??? )
}
