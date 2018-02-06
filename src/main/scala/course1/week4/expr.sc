
object expr {

  trait Expr
  case class Number(n: Int) extends Expr
  case class Sum(e1: Expr, e2: Expr) extends Expr
  case class Prod(e1: Expr, e2: Expr) extends Expr

  def show(e: Expr): String = e match {
      case Number(x) => x.toString
      case Sum(l, r) => show(l) + " + " + show(r)
      case Prod(l, r) => show(l) + " * " + show(r)
    }

    show(Sum(Number(1), Number(4)))
//    show(Sum(Prod(2, Var())))
}


