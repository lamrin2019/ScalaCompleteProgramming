// all collection are immutable
val mylist = List(1,2,3,4,5);
val newlist = mylist.take(4);
for(element <- mylist){
  println(element);
}
for(newelements <- newlist){
  println(newelements);
}
mylist.foreach((el)=>{
  println(el);
});

println(mylist(1));
println(mylist(4));
println(mylist.max);
println(mylist.sum);
println(mylist.min);
println(mylist.head);
println(mylist.tail);
println(mylist.length);
println(mylist.take(3));
println(mylist.takeRight(3));
println(mylist.reverse);