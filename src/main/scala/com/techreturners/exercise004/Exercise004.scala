package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight
  def getDateTimeWithGigaSecond: LocalDateTime = {
    import java.time.LocalDate
    import java.time.format.DateTimeFormatter
  var processStart:LocalDateTime= dateTime
  var processEnd:LocalDateTime = processStart .plusSeconds(1000000000)
  processEnd

  }


}
