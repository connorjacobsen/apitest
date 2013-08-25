package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.SimpleResult

object Application extends Controller {
  
  def index = Action { implicit request =>
    Ok("Hello world!").withHeaders(CONTENT_TYPE -> "text/plain")
  }
  
}