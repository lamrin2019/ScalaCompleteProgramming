// string replace
val str = String.format("Scala is %s", "Cool");
println("Scala is %s".format("Cool"));
println(str);
val username = "nilesh";

// normal placehodler
println(s"this is a login event for $username");
// interpolation with place holder
println(f"this is ${username}%s");
// strings
/// smartstrings
/// string interpolation
//// string formatting
/// string regex

val d =
  """"Red wine when mixed with White wine make
    |is a
    |Rose wine """.stripMargin.replace("wine" , "wind");

println(d);