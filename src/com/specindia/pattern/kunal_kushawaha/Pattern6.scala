package com.specindia.pattern.kunal_kushawaha

object Pattern6 {
  //        *
  //      * *
  //    * * *
  //  * * * *
  //* * * * *
  def main(args: Array[String]): Unit = {
    var i: Int = 0
    var j: Int = 4-i

    for (i <- 0 to 4 by +1) {
      if (j >= 4 - i) {
        for (j <- 4 - i to 4 by +1) {
          print("* ")
        }
      }
      else {
        print(" ")
      }
      println()
    }
  }

}
