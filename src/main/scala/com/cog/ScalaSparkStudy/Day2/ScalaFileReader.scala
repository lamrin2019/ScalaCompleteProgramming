import scala.io.Source;


val lines = Source.fromFile("d:/accountinfo.csv").getLines();
for(a <- lines){
  println(a);
}
val username = "nilesh"
val a1 = 10;
val b1 = 20;
val txt = s"""
             @asfdasdfasdf
             @%sasfdasdfsdfadsfasd
             @afdasdfv | adsfsdf ${a1+b1}
             @asdfasdf
             @adsfasdf
  """.stripMargin('@').format("test")

println(txt);