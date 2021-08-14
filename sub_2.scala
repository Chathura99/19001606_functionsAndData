object sub_2 extends App {
  val x=new Rational3(3,4)
  val y=new Rational3(5,8)
  val z=new Rational3(2,7)

  println(x-y-z)
  
}
class Rational3(n:Int,d:Int){
  //for simplify
  def gcd(a:Int,b:Int):Int=
    if(b==0) a else gcd(b,a%b)
  val s=gcd(n,d)
  
  def numer=n/s
  def denom=d/s
  //get negative
  def neg=new Rational3(-this.numer,this.denom)
  //add
  def +(r:Rational3)=new Rational3(r.denom*numer+r.numer*denom,denom*r.denom)
  
  def -(r:Rational3)=this+r.neg
  
  override def toString= numer+"/"+ denom
}
