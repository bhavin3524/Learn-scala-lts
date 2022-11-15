package com.specindia.pattern.kunal_kushawaha

object Pattern2 {
  //  print this output pattern

  //  *
  //  **
  //  ***
  //  ****
  //  *****

  def main(args: Array[String]): Unit = {
    for (i: Int <- 0 to 4) {
      for (j: Int <- 0 to i) {
        print("* ")
      }
      println()
    }
  }
}
