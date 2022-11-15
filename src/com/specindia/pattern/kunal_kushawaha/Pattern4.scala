package com.specindia.pattern.kunal_kushawaha

object Pattern4 {

  //
  //  1
  //  1 2
  //  1 2 3
  //  1 2 3 4
  //  1 2 3 4 5

  def main(args: Array[String]): Unit = {
    for (i: Int <- 0 to 4 by +1) {
      for (j: Int <- 0 to i by +1) {
        print(j + 1 + " ")
      }
      println()
    }
  }
}
