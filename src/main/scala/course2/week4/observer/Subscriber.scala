package course2.week4.observer

/**
  * Created by irhspur on 2/13/18.
  */
trait Subscriber {

  def handler(pub: Publisher)

}
