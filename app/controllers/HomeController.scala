package controllers

import javax.inject._
import akka.actor.ActorSystem
import akka.stream.Materializer
import play.api._
import play.api.libs.streams._
import play.api.mvc._
import services.actors.MyWebSocketActor
import services.quotes.MarketQuotesClient

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (webJarAssets: WebJarAssets) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {

    Ok(views.html.index(webJarAssets))
  }

}
