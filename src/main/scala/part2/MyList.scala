package part2

import java.util.NoSuchElementException

import scala.annotation.tailrec

abstract class MyList {
  def head(): Int
  def tail(): MyList
  def isEmpty(): Boolean
  def add(element: Int): MyList
  override def toString: String = "[]"
}

object MyList{
  def apply(): MyList = Empty
  def apply(head: Int): MyList = new Cons(head, Empty)
}

object Empty extends MyList{
  override def head(): Int = throw new NoSuchElementException
  override def tail(): MyList = throw new NoSuchElementException
  override def isEmpty(): Boolean = true
  override def add(element: Int): MyList = new Cons(element, Empty)
}

class Cons(head: Int, tail: MyList) extends MyList {
  override def add(element: Int): MyList = new Cons(element, this)
  override def head(): Int = head
  override def isEmpty(): Boolean = false
  override def tail(): MyList = tail
  override def toString: String = {
    @tailrec
    def toStringHelper(element: MyList, acc: String): String = {
      if(element.isEmpty()) acc + " ]"
      else toStringHelper(element.tail, acc +", " + element.head)
    }
    toStringHelper(this.tail, "[ " + head)
  }

}

object MyApp extends App {
  val myList = MyList(1).add(2).add(20)
  println(myList.toString)

}