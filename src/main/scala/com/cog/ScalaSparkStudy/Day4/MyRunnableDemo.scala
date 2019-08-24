package com.cog.ScalaSparkStudy.Day4

object MyRunnableDemo extends  App{
  // thread creation and start code
  val t = new Thread(new MyRunnable);
  t.start();
}