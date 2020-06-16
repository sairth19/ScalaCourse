package part2

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = favoriteMovie == movie
    // We can use operators as method name
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(name.concat(s" ($nickname)"), favoriteMovie)
    def greeting(): String = s"Hi, I´m $name, and my favorite movie is $favoriteMovie"
    def unary_! : String = s"$name, What the heck??"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive : Boolean = true
    def learns(learning: String): String = s"Mary learns $learning"
    def learnsScala(): String = this learns "Scala"
    def apply(): String = s"Hi, My name is $name"
    def apply(times: Int): String = s"$name watched $favoriteMovie $times times"
  }

  val indira = new Person("Indira", "Inception")
  val sair = new Person("Sair", "Contact")

  println(sair.greeting())
  // Methods that are not expecting params or receive params but we do not pass
  // them because the method has defaults params we can omit parentheses in call
  println(indira.greeting)
  println(indira.likes("Inception"))
  // Infix notation. Only works with one param
  println(indira likes "Inception")
  println(indira + sair)

  // All operators are method on Scala
  println(2 + 1)
  println(2.+(1))
  println(3 * 2)
  println(3.*(2))

  // Prefix notation. Only allowed for +, -, ~, !
  val x = -1 // Equivalent to 1.unary_-
  val z = 1.unary_-
  println(x)
  println(z)
  println(!indira)
  println(indira.unary_!)

  // Postfix notation. Only works for methods that don´t receive params
  println(indira.isAlive)
  println(indira isAlive)

  // Apply. It´s an special method. Calls our objects like these were methods
  println(indira.apply())
  println(sair())

  println((indira + "La pendeja").name)
  println((+indira).age)
  println(indira learnsScala)
  println(indira(2))





}
