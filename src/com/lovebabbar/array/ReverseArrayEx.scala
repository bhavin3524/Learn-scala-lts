package com.lovebabbar.array


class Test {
  def reverseAnArray(arr: Array[String]): Array[String] = {
    var i: Int = 0

    var j = arr.length - 1

    while (i < j) {
      val str1 = arr(i)
      val str2 = arr(j)

      arr(i) = str2
      arr(j) = str1

      i += 1
      j -= 1
    }
    return arr
  }

  def printArray(arr: Array[String]): Unit = {
    for (i <- 0 until arr.length by +1) {
      print(arr(i) + "  ")
    }
  }
}

object ReverseArrayEx {
  def main(args: Array[String]): Unit = {
    val countries = Array("India", "USA", "Pakistan", "AUS", "China", "London", "Germany", "Russia")

    val test = new Test()

    test.printArray(countries)

    println("output:")

    test.printArray(test.reverseAnArray(countries))


  }
}
