package almaz.kg.investment.modeling.scala.entities

class Account (investor: Investor, positions: List[Position] = List()){

  var cash = investor.getInitialBalance

  def getCurrentBalance() = positions.filter(p => p.isClosed()).map(p => p.getResult()).sum + cash

  def closePosition(position: Position, closePrice: Double): Unit ={
    position.closePosition(closePrice)
  }







}
