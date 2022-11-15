package com.lovebabbar.array

class UnionInterSection {
  def union(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    val result = Array[Int](arr1.size + arr2.size)

    for (i <- 0 until (arr1.size + arr2.size)) {
      if (i < arr1.length ) {
        result(i) =arr1(i)
      }
      else {
        result(i) = arr2(result.length - i)
      }
    }
    result
  }

  def printArray(arr: Array[Int]): Unit = {
    for (i: Int <- 0 until (arr.length) by +1) {
      println(arr(i))
    }
  }
}

object UnionAndInterSection {
  def main(args: Array[String]): Unit = {

    val arr1 = Array(11, 12, 13, 14)
    val arr2 = Array(66, 67, 68, 78)

    val test = new UnionInterSection()
    val unionArray = test.union(arr1, arr2)

    println("Union of two array:")
    test.printArray(unionArray)

    println("Intersection of two array:")


  }
}
