package com.cog.ScalaSparkStudy.Day6

import org.apache.spark.{SparkConf, SparkContext}

object ReduceDemo2 {

  def main(args: Array[String]): Unit = {
    val a = Array(1,2,3,4,5,6,7,8,9,10);
    val conf = new SparkConf().setMaster("local[*]").setAppName("Reducer");
    val sc = SparkContext.getOrCreate(conf);
    val rdd = sc.parallelize(a);
    val result = rdd.reduce((a,b) => a+b);
    println(result);

  }
}