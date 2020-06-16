package part1

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFactorial(number: Int, acc: Int = 1): Int =
    if(number <=1) acc
    else trFactorial(number-1, number * acc)

  def saveImage(format: String = "jpg", height: Int, width: Int): Unit =
    println("The image has been saved")

  def saveImage2(format: String = "jpg", height: Int = 1920, width: Int = 1080): Unit =
    println("The image has been saved")

  // Ways to call saveImage method
  saveImage("bmb", 300, 300)
  saveImage(height = 500, width = 300)
  saveImage(width = 600, format = "png", height = 600)

  // Ways to call saveImage2 method
  saveImage2("bmb", 300, 300)
  saveImage2(width = 300)
  saveImage2(height = 300)
  saveImage2(format = "bmp")
  saveImage2(width = 600, format = "png", height = 600)
  saveImage2()

}
