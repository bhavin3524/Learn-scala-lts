package com.sravana

object Day4 {

  //    def <function_name>(parameters) : return type = { function body }

  def fun1() = {
    println("hello friends")
  }

  def main(args: Array[String]): Unit = {
    println(fun1())
  }


  //  which takes an input of integer and (function which accept input as integer and produce result of integer)
  def fun2(a: Int, fun3: Int => Int): Int = {
    fun3(a)
  }
}
