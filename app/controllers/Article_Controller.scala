package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.SimpleResult

object Article_Controller extends Controller {
  
  def index = Action { implicit request =>
    Ok("Article index!").withHeaders(CONTENT_TYPE -> "text/plain")
  }
  
}