package course2.week4.observer

/**
  * Created by irhspur on 2/10/18.
  */
class BankAccount extends Publisher{

  private var balance = 0

  def currentBalance = balance

  def deposit(amount: Int): Unit = {
    if (amount > 0) balance = balance + amount
    publish()
  }

  def withdraw(amount: Int): Unit =
    if (0 < amount && amount <= balance) {
      balance = balance - amount
      publish()
    } else throw new Error("Insufficient funds")

  override def toString: String = "Amount = " + balance

}
