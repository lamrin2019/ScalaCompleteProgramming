val secrets = Map("awskey" -> "#02399494", "azurekey" -> "2239394JDFlkasf");
println(secrets);

println(secrets("awskey"));

println(secrets.keys.mkString(","))
println(secrets.values.mkString(","));


List()