object transferMoney_3 extends App {
  val ac1=new BankAcc("Chathura",315,60000)
  val ac2=new BankAcc("Madhura",456,30000)
  val t=10000
  println(ac1.n+ "'s balance "+ ac1.b+"\n"+ac2.n+ "'s balance "+ ac2.b)
  ac1.transfer(ac2,t)
  println(ac1.n+ " transfer "+ t +" to "+ ac2.n)
  println(ac1.n+ "'s balance "+ ac1.b+"\n"+ac2.n+ "'s balance "+ ac2.b)

}
class BankAcc(name:String,accno:Int,bal:Double){
  var n=name
  var a=accno
  var b=bal
  
  def transfer(acc:BankAcc,b:Double)={
      acc.b=acc.b+b
      this.b=this.b-b
  }
}

