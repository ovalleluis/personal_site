package services.quotes

import org.joda.time.{Interval, DateTime}

/**
 * Created by luisovalle on 4/09/16.
 */
trait MarketQuotesClient {

  def getQuote(symbol: String, from: DateTime = DateTime.now().minusYears(1), to: DateTime = DateTime.now())

}
