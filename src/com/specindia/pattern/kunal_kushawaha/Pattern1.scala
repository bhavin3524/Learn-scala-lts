package com.specindia.pattern.kunal_kushawaha

object Pattern1 {

//  =============print this output pattern

//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *

  def main(args: Array[String]): Unit = {

    for (i: Int <- 1 to 5) {
      for (j: Int <- 1 to 5) {
        print("* ")
      }
      println()
    }
  }

}
