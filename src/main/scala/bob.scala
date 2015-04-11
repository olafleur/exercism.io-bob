class Bob {

  def isShouting(s: String) = s.toUpperCase == s

  def hey(arg: String): String = {
    if(isShouting(arg)) {
      "Whoa, chill out!"
    } else {
      "Whatever."
    }
  }

}
