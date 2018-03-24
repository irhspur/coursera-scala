package course3.week1.startingThreads

/**
  * Created by irhspur on 3/13/18.
  */
class Account(private var amount: Int = 0) {

  def transfer(target: Account, n: Int) = {
    this.synchronized {
      target.synchronized {
        this.amount -= n
        target.amount += n
      }
    }
  }

}
