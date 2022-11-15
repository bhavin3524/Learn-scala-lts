package com.sravana

object Day5 {
  //  Example of default arguments
  def main(args: Array[String]): Unit = {

    addition(2, 3) //5
    addition(4) //9
  }

  def addition(a: Int, b: Int = 5): Unit = {
    println(a + b)
  }

  def fun1(x: Int): Unit = {


    def fun2(y: Int): String = {
      return ""
    }
  }

}
