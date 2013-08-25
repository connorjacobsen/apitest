package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.SimpleResult

object Author extends Controller {
  
  def index = Action { implicit request =>
    Ok("Author index!").withHeaders(CONTENT_TYPE -> "text/plain")
  }
  
}