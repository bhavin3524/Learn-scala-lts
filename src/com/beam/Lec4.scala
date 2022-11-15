package com.beam

object Lec4 {

  val name: String = "abhishek"

  val age: Int = 77

  private val str: String = "My name is " + name + " and " + age + " years old "

  private val str2: String = s"My name is $name ${age} years old ..."


  println(str)

  def main(args: Array[String]): Unit = {

    println("Hello moto ....")

    println(str2)

  }
}
