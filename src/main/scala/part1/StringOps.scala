package part1

object StringOps extends App {
  val str = "Hello I´m learning Scala"

  // Java functions over strings
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length())

  //Scale functions
  val aNumberString = "26"
  val number = aNumberString.toInt


  // Prepends
  println('a' +: aNumberString)
  // Append
  println(aNumberString :+ 'a')
  // Reverse
  println("My name is Sair".reverse)
  // Take
  println("My name is Sair".take(2))

  //Specific Scala String interpolator

  //S-Interpolator
  val name = "Sair"
  val age = 26

  val greetingMessage = s"Hi my name is $name and I am $age years old"
  println(greetingMessage)

  val anotherGreetingMessage = s"Hi my name is $name and I am ${age + 1} years old"
  println(anotherGreetingMessage)

  //F-Interpolator
  val speed = 1f
  val myth = f"David can eat $speed%2.2f burgers per minute"
  println(myth)

  // Raw-interpolator
  // The scape chars does not work
  val message = raw"Hello there! \n my name is $name"
  println(message)
}
