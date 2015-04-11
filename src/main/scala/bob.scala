class Bob {

  def isShouting(s: String) = s.toUpperCase == s

  def isAQuestion(s: String) = s.last == '?'

  def hey(arg: String): String = {
    if (isShouting(arg)) {
      "Whoa, chill out!"
    } else {
      if (isAQuestion(arg)) {
        "Sure."
      } else {
        "Whatever."
      }
    }
  }

}
