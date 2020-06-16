package part1

object Functions extends App{
  def myFunction(a: String, b: Int): String =
    a + " " + b

  def myParameterlessFunction(): Int = 26

  def myRecursiveFunction(word: String, times: Int): String = {
    if(times == 1) word
    else word + " " + myRecursiveFunction(word, times - 1)
  }

  def greeting(name: String, age: Int): String = "Hello my name is $name and i am $age years old"

  def factorial(number: Int): Int = {
    if(number <= 0) 1
    else number * factorial(number - 1)
  }

  def fibonacci(number: Int): Int = {
    if(number <= 2) 1
    else fibonacci(number - 1) + fibonacci(number - 2)
  }

  def isPrime(number: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else number%t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(number/2)
  }

  val number = factorial(2)

  println(factorial(2))
  println(fibonacci(12))
  println(isPrime(19))
  println(isPrime(2003))
  println(isPrime(20 * 30))
}
