package part2

object Inheritance extends App {
  class Animal{
    protected def eat(): Unit = println("nomnom")
  }
  // For refer father class members we use super
  class Cat extends Animal {
    def crunch() ={
      super.eat
      println("Crunch crunch")
    }
  }

  val myCat = new Cat()
  myCat.crunch()

  // Constructors
  class Person(name: String, age: Int) {
    val language = "English"
    def this(name: String) = this(name, 0)
    def greeting(): String = s"Hi, my name is $name and I´m $age years old"
  }
  // For prevent overriding on members we use final
  // To avoid class inheritance we also use final
  // To prevent inheritance in others files we use sealed, and then the class only could by extended in the same file
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age){
    override val language: String = "Español"
    override def greeting(): String = s"Hola, mi nombre es $name y tengo $age años"
  }


  val person = new Person("Indira", 23)
  val adult = new Adult("Sair", 26, "1047464407")
  println((person greeting) + " " + person.language)
  println((adult greeting)+ " " + adult .language)

}
