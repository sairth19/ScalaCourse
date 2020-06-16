package part1

object ValuesVariablesType extends App{
  // Vals are inmutable
  // Integers
  val x: Int = 42
  // We can´t reassign vals value
  // Incorrect
  // val x = 2
  // x = 4
  // The lang can inference the data type
  val myNumber = 4
  val myString = "This is a string"

  // To show a message in console we use println
  println(x)

  // Scala basic types
  // Int
  val myInt: Int = 26
  // Strings
  val aString: String = "Hello World from Scala"
  println(aString)
  // Booleans
  val aBoolean: Boolean = true // Also can be false
  // Chars
  val aChar: Char = 'a'

  // More numeric types
  val aShort: Short = 4233
  val aLong: Long = 999999999
  val aFloat: Float = 2.5f
  val aDouble: Double = 3.14


  // Variables, like another language in scala variables are mutable
  var myName: String = "Sair Martinez"
  myName = "Indira Ruiz"
  // In functional programming variables are not recommended
  // because these cause side effects in our program flow
  // We should avoid variables in FP



}
