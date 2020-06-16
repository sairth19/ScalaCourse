package part1

import scala.annotation.tailrec

object Recursion extends App {


  def factorial(number: BigInt): BigInt = {
    @tailrec
    def factorialHelper(x: BigInt, acc: BigInt): BigInt =
        if(x <= 1) acc
        else factorialHelper(x-1, x * acc)
    factorialHelper(number, 1)
  }

  def fibonacci(number: Int): Int = {
    @tailrec
    def fibonacciHelper(x: Int, prev: Int, acc: Int): Int =
      if(x <= 2) return acc
      else fibonacciHelper(x-1, acc, acc + prev)

    fibonacciHelper(number, 1, 1);
  }

  def isPrime(number: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeUntil(t-1, number%t != 0)

    isPrimeUntil(number/2, true)
  }

  def repeatMessage(word: String, times: Int): String = {
    @tailrec
    def myHelper(times: Int, acc: String): String =
      if(times <= 1) acc
      else myHelper(times - 1, acc + " " +word)

    myHelper(times, word)
  }

  println(fibonacci(8))
  println(repeatMessage("Hola", 3))
  println(isPrime(629))
}
