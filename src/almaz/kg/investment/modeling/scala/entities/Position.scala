package almaz.kg.investment.modeling.scala.entities

import almaz.kg.investment.modeling.scala.entities.TradeOperationType.TradeOperationType

class Position (ticker: String,
                tradeOperationType: TradeOperationType,
                volume: Double,
                openPrice: Double,
                var closePrice: Double = Double.MinValue,
                var closed: Boolean = false){
  val positionId: Int = PositionIdGenerator.getNextPositionId()

  def getPositionId = positionId
  def getTicker() = ticker
  def getOpenPrice() = openPrice
  def isClosed() = closed

  def getResult() = if (!isClosed()) calculateResult() else 0.0

  def calculateResult() = {
    if (isClosed()){
      tradeOperationType match {
        case TradeOperationType.BUY => closePrice - openPrice
        case TradeOperationType.SELL => openPrice - closePrice
      }
    } else 0.0
  }

  def closePosition(closePrice: Double): Unit ={
    this.closed = true
    this.closePrice = closePrice
  }
}
