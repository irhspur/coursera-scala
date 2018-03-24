package course3.week1.startingThreads

/**
  * Created by irhspur on 3/13/18.
  */
object SynchronizedBlock {

  private val x = new AnyRef()
  private var uidCount = 0L

  def main(args: Array[String]): Unit = {
    third()
  }

  def third(): Unit = {
    startThread()
    startThread()
  }

  def getUniqueId(): Long = x.synchronized {
    uidCount = uidCount + 1
    uidCount
  }

  def startThread(): Unit = {
    val t = new Thread {
      override def run(): Unit = {
        val uids = for (i <- 0 until 10) yield getUniqueId()
        println(uids)
      }
    }
    t.start()
    t
  }
}
