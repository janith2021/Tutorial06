object Q1 {
  val alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encrypt=(ch:Char,key:Int,alpha:String) =>
    alpha((alpha.indexOf(ch.toUpper)+key)%alpha.length)

  val decrypt=(ch:Char,key:Int,alpha:String)=>
  alpha((alpha.indexOf(ch.toUpper)-key)%alpha.length)

  val caiper= (ci:(Char,Int,String)=>Char,t:String,key:Int,alpha:String)=> t.map(ci(_,key,alpha))

  def main(args: Array[String])={

    print("Please Enter Your Text= ")
    val text= scala.io.StdIn.readLine()
    val caiText=caiper(encrypt,text,1,alpha)
    val PlaiText=caiper(decrypt,caiText,1,alpha)

    println("Encrypted Value= "+caiText)
    println("Decrypted Value= "+PlaiText)
  }
}
