import resources._
import views.{AbstractView, LongFormView, ShortFormView}

object Main extends App {
  println("Try to combine views and resources \n")

  val artist: Artist = new Artist
  val artistResource: AbstractResource = new ArtistResource(artist)

  val book: Book = new Book
  val bookResource: AbstractResource = new BookResource(book)

  val longFormViewWithArtist: AbstractView = new LongFormView(artistResource)
  val shortFormViewWithArtist: AbstractView = new ShortFormView(artistResource)

  val longFormViewWithBook: AbstractView = new LongFormView(bookResource)
  val shortFormViewWithBook: AbstractView = new ShortFormView(bookResource)

  println(longFormViewWithArtist.show)
  println("--------------------------------")
  println(shortFormViewWithArtist.show)
  println("--------------------------------")

  println(longFormViewWithBook.show)
  println("--------------------------------")
  println(shortFormViewWithBook.show)
  println("--------------------------------")
}