trait FeatureA {
  val a = 10
  def print()
  def post()
  def act()
}

trait FeatureB {
  val b = 20
  def  bundle(): Int
}

class Printer extends FeatureA with FeatureB{
  def print(): Unit ={

  }
  def post(): Unit ={

  }
  def act(): Unit ={

  }

  def bundle(): Int = {
    println("This is test application")
    10
  }

  def myprinter(): Unit = {
    println(a)
    println(b)
  }
}

val f1:FeatureA = new Printer()
f1.act()
f1.post()
f1.print()

val f2:FeatureB = new Printer()
f2.bundle()

val f3:Printer = new Printer()
f3.act()
f3.bundle()
f3.post()
f3.print()
