object exercise2Repeat {
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }

    loop(a, 0)
  }

  sum(x => x * x, 3, 5)

  def product(f: Int => Int)(a: Int, b: Int): Int =
      if (a > b) 1
      else f(a) * product(f)(a + 1, b)

  product(x => x)(3, 5)

  def factorial(a: Int): Int = product(x => x)(1, a)

  factorial(3)

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

  def product1(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  product1(x => x * x)(3, 4)

}
