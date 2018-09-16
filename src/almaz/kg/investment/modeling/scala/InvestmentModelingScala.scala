package almaz.kg.investment.modeling.scala

import almaz.kg.investment.modeling.scala.actions._
import almaz.kg.investment.modeling.scala.entities.{Account, Investor}
import almaz.kg.investment.modeling.scala.helpers.MainHelper

import scala.io.StdIn

class InvestmentModelingScala {

  val mainHelper = MainHelper

  val actions: List[AbstractAction] = List(HelpAction, TickersAction, AccountAction, PositionsAction)

  var account: Account = new Account(new Investor("Anonimous", 100000))

  def startModeling(): Unit ={

    mainHelper.printWelcomeMessage()

    println("Представьтесь, пожалуйста")
    val name = StdIn.readLine("$- ")
    println("Укажите начальную сумму (100 000 рублей по умолчанию)")
    val initialBalance = MainHelper.readIntValue()

    val investor = new Investor(name, initialBalance)
    account = new Account(investor)

    println("Начинаем эмуляцию")
    while (true){
      val input = StdIn.readLine("$- ")

      actions.foreach(a => a.process(this, input.trim.toLowerCase()))
    }
  }

}
