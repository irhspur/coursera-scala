
object Greeting {
	def main(args: Array[String]) = println("Hello World!")
	
	def init[T](xs: List[T]): List[T] = xs match {
		case List() => throw new Error("init of empty list")
		case List(x) => List()
		case y :: ys => y :: init(ys)
	}

	def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
		case List() => ys
		case z :: zs => z :: concat(zs, ys)
	}

	def reverse[T](xs: List[T]): List[T] = xs match {
		case List() => xs
		case y :: ys => reverse(ys) ++ List(y)
	}
	
	def removeAt[T](n: Int, xs: List[T]): List[T] = (xs take n) ::: (xs drop (n + 1))

	val fruit = List("apples", "oranges", "pears")
	val nums = List(1, 2, 3)
	val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
	val empty = List()

	removeAt(0, fruit)
	println(fruit)

	val newFruit = (fruit take 1) ::: (fruit drop 2)
	println(newFruit)
}

