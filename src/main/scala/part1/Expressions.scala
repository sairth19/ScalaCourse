package part1

object Expressions extends App{
  val myAge = 2020 - 1994
  println(myAge)

  // IF sentence in Scala is an expression, its behavior is different other languages like java or python
  val message = if(myAge >= 21 ) "You can order beers :)" else "You can´t drink. :("
  println(message)

  // Everything in scala is an expression
  // avoid loops
  // The next is bad practice in Scala
  var i =  0
  while(i < 10) {
    println(i)
    i+=1
  }
  // Blocks
  val codeBlock = {
    val x = 1
    val z = x + 1
  }


}
