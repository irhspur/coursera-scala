package course3.week1.startingThreads

/**
  * Created by irhspur on 3/13/18.
  */
class HelloThread extends Thread{
  override def run(): Unit = {
    println("Hello World")
  }
}
