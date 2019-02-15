import scala.io.Source

object mnemonics {

  val in = Source.fromURL("https://lamp.epfl.ch/wp-content/uploads/2019/01/linuxwords.txt")

  val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter))

  val mnem = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ"
  )

  /** Invert the menm map to give a mapp from chars 'A' ... 'Z' to '2' ... '9' */
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit

  /** Maps a word to the digit string it can represent, e.g. "Java" -> "5282" */
  def wordCode(word: String): String =
    word.toUpperCase map charCode

  /**
    * A map from digit string to the words that represent them,
    * e.g. "5282" -> List("Java", "Kata", "Lava", ...)
    * Note: A missing number should map the empty set, e.g. "1111" -> List()
    */
  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq()

  def encode(number: String): Set[List[String]] =
    if (number.isEmpty) Set(List())
    else {
      for {
        split <- 1 to number.length
        word <- wordsForNum(number take split)
        rest <- encode(number drop split)
      } yield word :: rest
    }.toSet

  encode("7225247386")

  def translate(number: String): Set[String] =
    encode(number) map (_ mkString " ")

  translate("7225247386")

}