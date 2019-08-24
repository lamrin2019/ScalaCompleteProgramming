package com.cog.ScalaSparkStudy.Day8


import org.apache.spark.storage.StorageLevel
import org.apache.spark.{SparkConf, SparkContext}

object AccumulatorDemo {
  def main(args: Array[String]): Unit = {
    val sc = SparkContext.getOrCreate(new SparkConf().setMaster("local[*]").setAppName("sparkaccum"))
    val data = sc.textFile("d:/inputData/airports.csv");
    data.persist(StorageLevel.DISK_ONLY)
    val bl = sc.longAccumulator("CURRENT_RECORD_POSITION");
    data.foreach(line=>{
      println(line);
      bl.add(1);
    });
    println(bl.value)
    Thread.sleep(1000000);


  }
}
