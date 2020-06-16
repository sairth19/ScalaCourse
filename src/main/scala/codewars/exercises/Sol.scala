package codewars.exercises

import scala.annotation.tailrec

object Sol extends App {

  def getCount(inputStr: String): Int = {
    @tailrec
    def getVowelsCountHelper(letter: Char, position: Int, acc: Int): Int = {
      val newAcc = if(isVowel(letter)) acc + 1 else acc
      if(position == inputStr.length - 1) newAcc
      else getVowelsCountHelper(inputStr.charAt(position + 1), position + 1, newAcc)
    }

    if(inputStr.isEmpty) 0
    else getVowelsCountHelper(inputStr.charAt(0), 0, 0)
  }

  def isVowel(letter: Char): Boolean =
    "aeiou".indexOf(letter) >= 0

  val text = "aeiou"

  println(getCount(text))
}