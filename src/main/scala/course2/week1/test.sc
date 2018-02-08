object test {

  // Function1
  val f: String => String = { case "ping" => "pong" }
  f("ping")
//  f("ag")

  // PartialFunction
  val f1: PartialFunction[String, String] = { case "ping" => "pong" }

  f1("ping")
  f1.isDefinedAt("ag")

}