package course2.week4.observer

/**
  * Created by irhspur on 2/8/18.
  */
object RunBankAccount {

  def main(args: Array[String]): Unit = {


    val a = new BankAccount
    val b = new BankAccount
    val c = new Consolidator(List(a, b))

    a deposit 20
    b deposit 30

    println(c.totalBalance)

  }


}
