package course1.week5

object HigherOrderListFunction {

  val nums = List(2, -4, 5, 7, 1)
  val fruits = List("apple", "pineapple", "orange", "banana")
  val data = List("a", "a", "a", "b", "c", "c", "a")

	def main(args: Array[String]) = {

//    squareListTest()
//    filterTest()
//    packTest()
    encodeTest()
	}

  def packTest(): Unit = {
    println(pack(data))
  }

  def encodeTest(): Unit = {
    println(encode(data))
  }

  def filterTest(): Unit = {
    println(nums filter (x => x > 0))
    println(nums filterNot (x => x > 0))
    println(nums partition (x => x > 0))

    println(nums takeWhile (x => x > 0))
    println(nums dropWhile (x => x > 0))
    println(nums span (x => x > 0))

  }

  def squareListTest(): Unit = {
    println(squareList(nums))
    println(squareListMap(nums))
  }

	def squareList(xs: List[Int]): List[Int] =
    xs match {
      case Nil => xs
      case y :: ys => y * y :: squareList(ys)
    }

  def squareListMap(xs: List[Int]): List [Int] =
    xs map (x => x * x)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length))


}
