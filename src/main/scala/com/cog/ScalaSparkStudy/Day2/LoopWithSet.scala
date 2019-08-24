val myset = Set(1, 2 , 3 , 4 , 2, 2, 3,4,4,6 ,7);

println(myset.mkString(","));
// note the myset(index) is actuall not a index but a value comparison
/// when i say myset(10) it check if value 10 exists inside the set and returns
//  a boolean value
println(myset(10));

// functional methods on set
println(myset.head);
println(myset.tail);
println(myset.size);
println(myset.take(2));

for(el <- myset){
  println(el);
}
/// this is foreach as function
myset.foreach((el)=>{
  println(el);
});


println(myset.isEmpty);

val newset = myset + 20; // append 20 to existing set but as exisiting is immutable
//  a new set will get created
// myset + 20  =  myset.+(20);
println(newset);
println(myset);


val set1 = Set("mango", "cheries")
val set2 = Set("pineapple", "watermelon");


// concat 2 sets by making use of ++

val allfruits = set1.++(set2);
/// set1 ++ set2 //
println(allfruits.mkString(","));

println(List(1,2,3,4,5,6,7,8))



val mydata = Set("1","2","3");

println(myset(1));

val mylist = List(1, 23, 54);

println(mylist(2));

val complexList = List("xX", 1, Console);
for(x <- complexList){

}

val x1 = (1, "xxx");
println(x1);


val x2 = Tuple2(1, "xxxx");
println(x2);

(1,2,34,5,6,67,8,8,9,0,0,20,"123213", "!23123", "123123")