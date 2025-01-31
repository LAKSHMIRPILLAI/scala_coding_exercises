package com.techreturners.exercise001

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String = word.charAt(0).toUpper+word.substring(1)

  def generateInitials(firstName: String, lastName: String): String =firstName.charAt(0).toUpper+"."+lastName.charAt(0).toUpper

  def addVat(initialPrice: Double, interestRate: Double) : Double = Math.round(initialPrice*(1+interestRate/100)*100.0)/100.0

  def reverse(sentence: String) : String = sentence.reverse

  /**
   * Here we show using a Scala sequence which is a type of collection
   * https://alvinalexander.com/scala/seq-class-methods-examples-syntax/
   *
   * @param users A collection of users
   * @return
   */
  def countLinuxUsers(users: Seq[User]):Int= {
    var cnt:Int=0
    if (users!=null) {
      for (e <- users) {
        if (e.osType.toLowerCase == "linux")
          cnt += 1
      }
    }
    else cnt=0
    cnt
  }

}