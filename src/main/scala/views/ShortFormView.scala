package views

import resources.AbstractResource

class ShortFormView(abstractResource: AbstractResource) extends AbstractView(abstractResource){
  override def show: String = {
    val content = "This is a short form view \n" +
      "This is for content space \n" +
      abstractResource.snippet

    content
  }
}