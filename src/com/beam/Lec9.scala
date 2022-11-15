package com.beam

object Lec9 {
  def main(arr: Array[String]): Unit = {

    println("Hello scala")

    for (i: Int <- 1 to 10) {

      println("for loop testing ..." + i)

    }

    for (j: Int <- 1 until (9))
      println("response of i ->" + j)

    for (i: Int <- 1 to 5; j: Int <- 3 to 8) {
      println("response of i " + i + "--and  - " + "response of j  --" + j)
    }

    //    for loop yield keyword
    val countryList = List("India", "USA", "Japan", "Russia", "Pakistan")

    countryList.foreach(country => {
      println(country)
    })

    //    iterate list using for loop
    for (country <- countryList) {
      println(country)
    }

    println("===================================")
    //    iterate list using for each method
    countryList.foreach((country) => {
      println(country)
    })

    println(" --------------- yield example -----------")
    val response = for (i <- countryList)
      yield i

    println(response)
  }

}
