package com.specindia.pattern.kunal_kushawaha

object Pattern3 {
//
//  *****
//  ****
//  ***
//  **
//  *
  def main(args: Array[String]): Unit = {
    for (i: Int <- 0 to 4 by +1) {
      for (j: Int <- 0 to 4 - i by +1) {
        print("* ")
      }
      println()
    }
  }

}
