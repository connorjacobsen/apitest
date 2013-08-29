package controllers

import play.api._
import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json._

import models.Author

object Author_Controller extends Controller {
  
  def index = Action { implicit request =>
    Ok("Author index!").withHeaders(CONTENT_TYPE -> "text/plain")
  }

  // create an Author node
  def create_author = Action { implicit request =>
  	Author.create()
  	Ok("Created one!")
  }
}