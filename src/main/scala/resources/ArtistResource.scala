package resources

class ArtistResource(artist: Artist) extends AbstractResource {
  override def snippet: String = artist.bio
}