package almaz.kg.investment.modeling.scala.actions

import almaz.kg.investment.modeling.scala.InvestmentModelingScala

object AccountAction extends AbstractAction {

  override def process(state: InvestmentModelingScala, params: String): Unit = {
    if (params.startsWith("balance"))
      println(state.account.getCurrentBalance())

    if (params.startsWith("cash"))
      println(state.account.cash)
  }
}
