class Bob {

  def hey(arg: String): String = {
    if (arg.trim().isEmpty) {
      "Fine. Be that way!"
    } else {
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

  def isAQuestion(s: String) = s.last == '?'

  def isShouting(s: String) = s.toUpperCase == s && containsACapitalLetter(s)

  def containsACapitalLetter(s: String): Boolean = s.exists(_.isUpper)

}
