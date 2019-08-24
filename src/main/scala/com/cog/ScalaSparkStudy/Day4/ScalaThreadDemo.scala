package com.cog.ScalaSparkStudy.Day4

object ScalaThreadDemo extends App{
  val thread = new Thread {
    override def run: Unit ={
      println(Thread.currentThread().getName);
    }
  }
  thread.start;

}