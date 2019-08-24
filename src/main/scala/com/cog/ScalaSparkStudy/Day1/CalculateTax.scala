package com.cog.ScalaSparkStudy.Day1

object CalculateTax {
  // anonymous function   lambda
  val tx = (amount: Int) => {
    100;
  }

  def taxCalculator(amount: Int): Double = {
    amount * 0.33;
  }
  def main(args: Array[String]): Unit = {
    println(taxCalculator(100));
    println(tx(10));
  }
}
