package part2.basics.exercises

object WriterNovelExercise extends App {
  val author = new Writer("Sair", "Martinez", 1994)
  val novel = new Novel("My Novel", 2009, author)

  val anotherAuthor = new Writer("Indira", "Ruiz", year = 1996)
  val anotherNovel = new Novel("Her Novel", 2010, anotherAuthor)

  println(author.fullName())
  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(anotherAuthor.fullName())
  println(anotherNovel.authorAge())
  println(anotherNovel.isWrittenBy(author))

  val novelCopy = novel.copy(2017)
  println(novelCopy.authorAge())
  println(novelCopy.isWrittenBy(author))
  println(novelCopy)

  var counter = new Counter()
  counter = counter.increment().increment().increment()
  println(counter.currentCount())
  counter = counter.decrement().decrement()
  println(counter.currentCount())
  counter = counter.increment(2).increment(7)
  println(counter.currentCount())
  counter = counter.decrement(100)
  counter = counter.recursiveIncrement(20)
  println(counter.currentCount())

}

class Writer(name: String, surname: String, val year: Int){
  def fullName(): String = name.concat(" ").concat(surname)
}

class Novel(name: String, releaseYear: Int, author: Writer){
  def authorAge(): Int =
    releaseYear - author.year;

  def isWrittenBy(author: Writer): Boolean =
    this.author.equals(author)

  def copy(newReleaseYear: Int): Novel =
    new Novel(this.name, newReleaseYear, author)

  override def toString: String = s"Title: ${this.name}, Author: ${this.author.fullName()}, Release in: ${this.releaseYear}"
}

class Counter(amount: Int = 0){
  def currentCount(): Int = this.amount
  def increment(): Counter = new Counter(this.amount + 1)
  def decrement(): Counter = new Counter(this.amount - 1)
  def increment(amount: Int): Counter = new Counter(this.amount + amount)
  def decrement(amount: Int): Counter = new Counter(this.amount - amount)

  def recursiveIncrement(count: Int): Counter = {
    if(count <= 0) this
    else increment().increment(count - 1)
  }
}
