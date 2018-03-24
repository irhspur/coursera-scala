package course3.week1.startingThreads

/**
  * Created by irhspur on 3/13/18.
  */
class HelloThread2 extends Thread{
  override def run(): Unit = {
    println("Hello")
    println("World")
  }
}
