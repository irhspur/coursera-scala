package course2.week3

/**
  * Created by irhspur on 2/8/18.
  */
object RunBankAccount {


  object sim extends Circuits with Parameters
  import sim._

  val in1, in2, sum, carry = new Wire

  def main(args: Array[String]) {



    halfAdder(in1, in2, sum, carry)
    probe("sum", sum)
    probe("carry", carry)

    in1 setSignal true
    run()

    in2 setSignal true
    run()

    in1 setSignal false
    run()

//    val acct = new BankAccount
//
//    acct deposit 50
//    println(acct.toString)
//
//    acct withdraw 20
//    println(acct.toString)
//
//    acct withdraw 20
//    println(acct.toString)
//
//    acct withdraw 10
//    println(acct.toString)

  }


}
