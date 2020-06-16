package part2

object OOPBasics extends App {
  val person = new Person("Sair", 26)
  val person2 = new Person2("Sair", 26)

  println(person)
  println(s"Hi guys, I´m ${person2.age} years old")
  println(person2.address)
  person2.greeting("Indira")
  person2.greeting()
  val person3 = new Person2()
  println(person3.age)
  person3.greeting("Indira")
}

class Person(name: String, age: Int)

/*
 * Constructor parameters are not public attributes
 * to say that constructor parameters are public attributes we need to use val or var
 * then we access instance attribute using instanceName.attributeName
 * else the attribute only can be acceded by the class
 */

class Person2(name: String = "Jon Doe", val age: Int = 0) {
  // Class attributes
  val address = "My home address"

  // Methods
  def greeting(name: String): Unit =
    println(s"${this.name} says: Hi $name")

  //Overloading
  def greeting(): Unit = println(s"Hi, I´m $name")

  //Multiple constructors
  // We need to call another constructor, can be primary or secondary constructor
  // This is unnecessary because in main constructor we can use default parameter
  /*
  def this(name: String) = this(name, 0)
  def this() = this("Jon Doe")
  */




  //Side effect
  //The class body is a code block
  //Everything inside it will executed
  println(2 +2)

}

