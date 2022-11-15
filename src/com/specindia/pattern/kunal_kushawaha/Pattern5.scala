package com.specindia.pattern.kunal_kushawaha

object Pattern5 {

  //  *
  //  **
  //  ***
  //  ****
  //  *****
  //  ****
  //  ***
  //  **
  //  *

  def main(args: Array[String]): Unit = {

    for (i: Int <- 0 to 10 by +1) {
      if (i < 5) {
        for (j: Int <- 0 to i by +1) {
          print("*")
        }
      }
      else {
        for (j: Int <- 0 to 10 - i by +1) {
          print("*")
        }
      }

      println()
    }
  }

}
