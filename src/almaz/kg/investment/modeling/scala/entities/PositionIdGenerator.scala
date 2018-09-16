package almaz.kg.investment.modeling.scala.entities

object PositionIdGenerator {
  private var currentId = 1

  def getNextPositionId() : Int = {
    currentId += 1
    currentId
  }
}

