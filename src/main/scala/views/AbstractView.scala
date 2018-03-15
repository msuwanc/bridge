package views

import resources.AbstractResource

abstract class AbstractView (abstractResource: AbstractResource) {
  def show: String
}