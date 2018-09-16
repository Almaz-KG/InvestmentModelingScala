package almaz.kg.investment.modeling.scala.actions

import almaz.kg.investment.modeling.scala.InvestmentModelingScala

object HelpAction extends AbstractAction {

  var helpMessage = "Investment modeling scala...." +
    "\nПоддерживаемые команды" +
    "\n- `position show` список позиций" +
    "\n- `position close [position_id]` закрыть позицию с введенным id" +
    "\n- `position open [ticker_id] [volume] [trading_type]` открыть торговую операцию " +
    "\n\t\t[ticker_id] - тикер финансового инструмента" +
    "\n\t\t[volume] - сумма сделки" +
    "\n\t\t[trading_type] - тип сделки, buy или sell" +
    "\n" +
    "\n- `balance` текущее состояние портфеля в сумме" +
    "\n- `cash` количество свободных денежных средств" +
    "\n- `tickers` список финансовых инструментов"

  override def process(state:InvestmentModelingScala, params: String): Unit = {

    if (params.startsWith("help"))
      println(helpMessage)
  }

}
