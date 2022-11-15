package com.sravana

object Day3 {
  def main(args: Array[String]): Unit = {
    //    pattern matching scala similar to switch case

    val a = 7

    a match {
      case 1 => {
        println("first case")
      }
      case 2 => {
        println("second case")
      }

      case 3 => {
        println("third case")
      }
      case _ => {
        println("default underscore case")
      }
    }
  }
}
