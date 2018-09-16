package almaz.kg.investment.modeling.scala.actions

import almaz.kg.investment.modeling.scala.InvestmentModelingScala

abstract class AbstractAction {

  def process(state:InvestmentModelingScala, params: String)

}
