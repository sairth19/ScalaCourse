package part1

object CBNvsCBV extends App {
  def callByValue(x: Long): Unit = {
    println(x)
    println(x)
  }

  def callByName(x: => Long): Unit = {
    println(x)
    println(x)
  }

  callByValue(System.nanoTime())
  callByName(2)

}
