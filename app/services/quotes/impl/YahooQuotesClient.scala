package services.quotes.impl

import com.github.nscala_time.time.Imports._
import javax.inject._
import play.api.libs.ws.{WSRequest, WSClient}

import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global

import services.quotes.MarketQuotesClient

/**
 * Created by luisovalle on 4/09/16.
 */

@Singleton
class YahooQuotesClient @Inject() (ws: WSClient) extends MarketQuotesClient {


  //http://ichart.finance.yahoo.com/table.csv?s=GOOG&a=04&b=01&c=2016&d=09&e=5&f=2016&g=d&ignore=.csv


  val url = "http://ichart.finance.yahoo.com/table.csv"


  override def getQuote(symbol: String , from: DateTime, to: DateTime): Unit = {

        val request: WSRequest = ws.url(url).withQueryString(
          "s" -> symbol,
          "a" -> from.getMonthOfYear.toString,
          "b" -> from.getDayOfMonth.toString,
          "c" -> from.getYear.toString,
          "d" -> to.getMonthOfYear.toString,
          "e" -> to.getDayOfMonth.toString,
          "f" -> to.getYear.toString,
          "g" -> "d",
          "ignore" -> ".csv"
        )


  }
}

