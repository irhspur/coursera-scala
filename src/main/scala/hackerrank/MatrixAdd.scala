package hackerrank

/**
  * Created by irhspur on 10/28/17.
  */
object MatrixAdd {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var a = Array.ofDim[Int](n, n)
    for (a_i <- 0 until n) {
      for (a_j <- 0 until n) {
        a(a_i)(a_j) = sc.nextInt()
      }
    }
    printMatrix(a, n)
    print(getAbs(addPrimaryDiag(a, 0, n, 0) + addSecondaryDiag(a, 0, n, 0)))
  }

  def printMatrix(arr: Array[Array[Int]], n: Int): Unit = {
    for (i <- 0 until n) {
      for (j <- 0 until n) {
        print(arr(i)(j) + " ")
      }
      println()
    }
  }

  def addPrimaryDiag(arr: Array[Array[Int]], firstIndex: Int, lastIndex: Int, pSum: Int): Int = {
    if (firstIndex < lastIndex)
      pSum + addPrimaryDiag(arr, firstIndex + 1, lastIndex, arr(firstIndex)(firstIndex))
    else
      pSum
  }

  def addSecondaryDiag(arr: Array[Array[Int]], firstIndex: Int, lastIndex: Int, pSum: Int): Int = {
    if (firstIndex < lastIndex) {
      pSum + addSecondaryDiag(arr, firstIndex + 1, lastIndex, arr(firstIndex)(lastIndex - 1 - firstIndex))
    }
    else
      pSum
  }

  def getAbs(n: Int): Int = if (n < 0) -n else n

}
