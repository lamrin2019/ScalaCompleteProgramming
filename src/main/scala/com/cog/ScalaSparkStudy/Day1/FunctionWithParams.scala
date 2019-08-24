package com.cog.ScalaSparkStudy.Day1

object FunctionWithParams
{
  def add(num1:Int=1, num2:Int=2 , action:String): Int ={
    println("Action........" + action);
    num1+num2;
  }
  def main(args: Array[String]): Unit = {
    println(add(action="add"));
  }
}