package views

import resources.AbstractResource

class LongFormView(abstractResource: AbstractResource) extends AbstractView(abstractResource) {
  override def show: String = {
    val content = "This is a long form view \n" +
      "This is for header space \n" +
      "This is for content space \n" +
      abstractResource.snippet + "\n" +
      "This is for footer space"

    content
  }
}