package course2.week4.frp

/**
  * Created by irhspur on 2/10/18.
  */
class BankAccount {

  var balance = Var(0)

  def currentBalance = balance

  def deposit(amount: Int): Unit = {
    if (amount > 0) {
      val b = balance()
      balance() = b + amount
    }
  }

  def withdraw(amount: Int): Unit =
    if (0 < amount && amount <= balance()) {
      val b = balance()
      balance() = b - amount
    } else throw new Error("Insufficient funds")

  override def toString: String = "Amount = " + balance()

}
