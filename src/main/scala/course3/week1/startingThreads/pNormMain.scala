package course3.week1.startingThreads

/**
  * p-norm is a generalization of the notion of length from geometry
  * 2-norm of a two-dimensional vector (a1, a2) is (a1^2 + a2^2)^1/2
  */
object pNormMain {

  def main(args: Array[String]): Unit = {

  }

  def sumSegmet(a: Array[Int], p: Double, s: Int, t: Int): Int = {
    var i = s
    var sum: Int = 0
    while(i < t) {
      sum = sum + power(a(i), p)
      i = i + 1
    }
    sum
  }

  def power(x: Int, p: Double): Int = math.exp(p * math.log(math.abs(x))).toInt

  // Should be passed by computations indicated by =>
  def parallel[A, B](taskA: => A, taskB: => B): (A, B) = {...}

  // Simple sequential version------------------------------------------------------

  def pNorm(a: Array[Int], p: Double): Int =
    power(sumSegmet(a, p, 0, a.length), 1/p)

  // Simple sequential version--------------------------------------------------------

  // Parallel verison ----------------------------------------------------------------
  def pNormParallel(a: Array[Int], p: Double): Int = {
    val m = a.length / 2
    val (sum1, sum2) = parallel(sumSegmet(a, p, 0, m),
                                  sumSegmet(a, p, m, a.length)
                        )
  }
  // Parallel verison ----------------------------------------------------------------


}
