object test {

  val xs = Array(1, 2, 3, 44)
  xs map (x => x * 2)

  val s = "Hello World"
  s filter (c => c.isUpper)
  s exists (c => c.isUpper)
  s forall (c => c.isUpper)

  val pairs = List(1, 2, 3) zip s
  pairs.unzip

  s flatMap (c => List('.', c))

  xs.sum
  xs.max


  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)

  isPrime(2)

}