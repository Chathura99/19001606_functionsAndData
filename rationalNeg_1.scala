object rationalNeg_1 extends App {
  val r1=new Rational1(2,3)
  val r2=new Rational1(1,2)
  println(r1.neg)  
}
class Rational1(n:Int,d:Int){
  def numer=n
  def denom=d
  
  def neg=new Rational1(-this.numer,this.denom)
  
  override def toString= numer+"/"+ denom
}