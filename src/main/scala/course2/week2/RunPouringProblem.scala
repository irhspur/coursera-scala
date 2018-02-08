package course2.week2

/**
  * Created by irhspur on 2/8/18.
  */
object RunPouringProblem {
  def main(args: Array[String]) {
    val problem = new Pouring(Vector(4, 9))
    println(problem.moves)
    println(problem.pathSets.take(3).toList)
    println(problem.solutions(6))


//    val problem1 = new Pouring(Vector(4, 7, 9))
//    println(problem1.moves)
  }


}
