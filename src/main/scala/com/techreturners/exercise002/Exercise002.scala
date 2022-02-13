package com.techreturners.exercise002

class Exercise002 {

    def isFromManchester(person: Person): Boolean = person match {
      case Person(_,_,"Manchester",_)=>true
      case _ =>false}

  def canWatchFilm(person: Person, ageLimit: Int ): Boolean = {
    person.age>=ageLimit
  }


}

case class Person (var firstName: String, var lastName: String, var city: String,var age:Int) {
}
