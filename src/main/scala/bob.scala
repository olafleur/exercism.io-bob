class Bob {

  def hey(message: String) = {
    if (message.trim().isEmpty) {
      "Fine. Be that way!"
    } else {
      if (isShouting(message)) {
        "Whoa, chill out!"
      } else {
        if (message.last == '?') {
          "Sure."
        } else {
          "Whatever."
        }
      }
    }
  }

  def isShouting(s: String) = s.toUpperCase == s && s.exists(_.isUpper)

}
