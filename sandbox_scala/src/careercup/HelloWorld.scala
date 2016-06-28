package careercup

/**
 * Created by luisovalle on 28/06/16.
 */
object HelloWorld {


  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    println( sortMaxMin( List(1,2,3,4,5,6)))
    println( sortMaxMin( List(1,2)) )
    println( sortMaxMin( List(1)) )
    println( sortMaxMin( List()) )


  }

  def sortMaxMin(input: List[Int]) : List[Int] =  input match {

    case first :: (l :+last) => last :: first :: sortMaxMin(l)
    case first :: Nil =>  List(first)
    case Nil => Nil


  }
}
