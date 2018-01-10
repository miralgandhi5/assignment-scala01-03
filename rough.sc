val input = List(10,20,30)
input map {
  case x if(x==10) => print(x)
  case _ =>
}
def calculateArea(shape: String,sideOne: Int, sideTwo: Int) = {
  def area(sideOne: Int, sideTwo: Int,area: (Int,Int) => Int) = area(sideOne,sideTwo)


  shape match {
    case "rectangle" => area(sideOne,sideTwo,(a,b) => a*b)
    case "rhombus" => area(sideOne,sideTwo,(a,b)=> a * b / 2)
    case "parallelogram" => area(sideOne,sideTwo,(a,b)=>a*b)
    case _ => {
      print("not a valid option")
      -1
    }
  }

}
calculateArea("square",10,20)
def length( inputList: List[Int] ) = {
  def listLength(inputList: List[Int] , pos: Int): Int = {
    inputList match {
      case Nil => pos
      case head :: tail => listLength(tail, pos + 1)
    }
  }
  listLength(inputList,0)

}
length(List())
def reverse( inputList: List[Int] ) = {
  def reverseList(inputList: List[Int] , outputList: List[Int]): List[Int] = {
    inputList match {
      case Nil => outputList
      case head :: tail => reverseList(tail, head :: outputList)
    }
  }
  reverseList(inputList,List[Int]())

}
reverse(List(1,2,3,4))
