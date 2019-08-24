val xs = List(1, 2, "xxxx", "113");

for(x <- xs){
  (x.asInstanceOf[Int]) + 1;
}

//sugared syntax
val mytuple = (1, "xxxxx" , 20.20D);

// acutual syntax
val mytuple1 = new Tuple3(1, "xxxxx" , 20.20D);