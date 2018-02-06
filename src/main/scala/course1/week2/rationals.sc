object rationals {

  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x.numer
  x.denom
  x.add(y)

  y.add(y)
  x.less(y)
  x.max(y)
  new Rational(2)

  class Rational(x: Int, y: Int) {

    require (y > 0, "denominator must be positive")

    def this(x: Int) = this(x, 1)

    private def gcd (a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def numer = x
    def denom = y

    def less(that: Rational) = numer * that.denom < that.numer * denom

    def max(that: Rational) = if (this.less(that)) that else this

    def add(that: Rational) =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def neg: Rational = new Rational(-numer, denom)

    def sub(that: Rational) = add(that.neg)

    override def toString: String = {

      val g = gcd(numer, denom)

      numer / g + "/" + denom / g
    }
  }
}

