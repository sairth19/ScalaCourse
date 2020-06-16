package codewars.exercises

import scala.annotation.tailrec

object SeriesSum extends App {
  def seriesSum(n: Int): String = {
    @tailrec
    def seriesSumHelper(s: Int, acc: Float): Float = {
      val term: Float = (1f/(2*(s-1) + s))
      if(s <= 0) 0
      else if(s == 1) acc + 1
      else seriesSumHelper(s-1, acc + term)
    }
    seriesSumHelper(n, 0)

    f"${seriesSumHelper(n, 0)}%2.2f"
  }

  println(seriesSum(3))

}
