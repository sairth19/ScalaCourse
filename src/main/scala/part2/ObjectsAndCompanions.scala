package part2

object ObjectsAndCompanions extends App {
  object Person {
    val N_EYES = 2
    // Factory method
    def apply(age: Int, name: String): Person = new Person(name, age)
  }

  class Person(name: String, age: Int){
    def greeting(): String = s"Hi, my name is $name and I´m $age years old"
  }

  val sair = Person(26, "Sair")

  println(sair.greeting())


}
