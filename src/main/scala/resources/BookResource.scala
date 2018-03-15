package resources

class BookResource(book: Book) extends AbstractResource {
  override def snippet: String = book.title
}
