package course3.week1.startingThreads

/**
  * Created by irhspur on 3/13/18.
  */
object Main {

  private var uidCount = 0L

  def main(args: Array[String]): Unit = {
    third()
  }

  def first(): Unit = {
    val t = new HelloThread

    t.start()
    t.join()
  }

  def second(): Unit = {
    val t = new HelloThread2
    val s = new HelloThread2

    t.start()
    s.start()
    t.join()
    s.join()
  }

  def third(): Unit = {
    startThread()
    startThread()
  }

  def getUniqueId(): Long = {
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
