package com.cog.ScalaSparkStudy.Day3

object App {
  // this is method that wishes to tested ....
  def add(x:Int , y:Int ): Int = {
    x*y;
  }

  // order for traversing the elements in the collection is from left to right and hence the name foldLeft
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}