import scala.collection.mutable.ListBuffer

class Deadline {
  var day: Int = ???
  var month: Int = ???
  var year: Int = ???
}

enum Status {
  case Taken(Deadline: Deadline, user: User)
  case Free()
}

class Book {
  var name: String = ???
  var copyNumber: Int = ???
  var status: Status = ???
}

class Catalogue {
  var catalogue: List[Book] = ???
}

trait User {
  var catalogue: List[Book] = ???
  var name: String = ???

  def browse(): List[Book] = ???
}

trait Librarian extends User {

  override def browse(): List[Book] = ???
  def addBook(newBook: Book): Unit = ???
  def updateBook(updatedBook: Book, wrongBook: Book): Unit = ???
  def removeBook(damagedBook: Book): Unit = ???
}

trait Member extends User {

  override def browse(): List[Book] = ???
  def borrowBook(book: Book): Unit = ???
  def returnBook(book: Book): Unit = ???
  def deadline(book: Book): Deadline = ???
  def search(name: String): List[Book] = ???
  def notification(): String = ???
}

class LibrarianManager extends Librarian {
  var name: String = ???

  override def browse(): List[Book] = ???
  override def addBook(newBook: Book): Unit = ???
  override def updateBook(updatedBook: Book, wrongBook: Book): Unit = ???
  override def removeBook(damagedBook: Book): Unit = ???
}

class memberManager extends Member {
  var name: String = ???

  override def browse(): List[Book] = ???
  override def borrowBook(book: Book): Unit = ???
  override def returnBook(book: Book): Unit = ???
  override def deadline(book: Book): Deadline = ???
  override def search(name: String): List[Book] = ???
  override def notification(): String = ???
}

