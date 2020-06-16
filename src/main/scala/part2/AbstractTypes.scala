package part2

object AbstractTypes extends App {
  abstract class Animal {
    val creatureType: String
    def eat(): Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat(): Unit = println(s"crunch crunch")
  }

  trait Carnivorous {
    def eat(animal: Animal): Unit
  }

  class Crocodilo extends Animal with Carnivorous {
    override val creatureType: String = "Croc"
    override def eat(): Unit = println("nomnomnom")

    override def eat(animal: Animal): Unit = println(s"I´m a croc and I´m eating a ${animal.creatureType}")
  }

  val dog = new Dog
  val crocodilo = new Crocodilo

  crocodilo.eat(dog)

  //Trait vs Abstract classes
  // 1. Traits do not have constructor parameters
  // 2. Multiple traits can be inherited by the same class
  // 3. Trait = Behavior, Abstract Classes = Thing
}
