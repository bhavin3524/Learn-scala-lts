package com.lovebabbar.array

import scala.collection.mutable


class FindKthMaxMinTest {
  def findCeilOfMaxMinElement(arr: Array[Int], k: Int): Int = {
    val priorityQueue = new mutable.PriorityQueue[Int]

    for (i: Int <- 0 until arr.length by +1) {
      priorityQueue.addOne(arr(i))
    }

    val iterator = priorityQueue.iterator

    while (iterator.hasNext) {
      println(iterator.next())
    }

    //    for(i<-0 until(k) by +1)
    //      {
    //        priorityQueue.
    //      }

    return priorityQueue.iterator.next()
  }
}

object FindKthMaxMin {
  def main(args: Array[String]): Unit = {

    val findKthMaxMinTest = new FindKthMaxMinTest()

    val arr = Array(44, 33, 22, 66, 77, 11)

    val k = 2

    val i = findKthMaxMinTest.findCeilOfMaxMinElement(arr, k)

    println("Max element is :" + i)

  }
}
