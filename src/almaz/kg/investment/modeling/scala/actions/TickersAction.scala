package almaz.kg.investment.modeling.scala.actions

import almaz.kg.investment.modeling.scala.InvestmentModelingScala

object TickersAction extends AbstractAction {

  override def process(state:InvestmentModelingScala, params: String): Unit = {

    val tickers =
        "AFLT - Aeroflot\n" +
        "AFKS - AFK Sistema\n" +
        "ALRS - Alrosa\n" +
        "BANE - Bashneft ANK ao\n" +
        "ROSN - NK Rosneft" +
        "MTSS - MTS" +
        "GZPR - Gazprom" +
        "SBER - Sberbank"

    if (params.startsWith("tickers"))
      println(tickers)

  }
}
