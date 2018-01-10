

object Operations {

  def doubleListElements(inputList: List[Int]): List[Int] = {
    inputList map (x => x * 2)
  }

  def fibonacciUsingTailRecursion(position: Int): List[Int] = {

    def fibonacci(pos: Int, first: Int, prev: Int, outputList: List[Int]): List[Int] = {
      pos match {
        case 0 => outputList
        case _ => fibonacci(pos - 1, prev, prev + first, first :: outputList)

      }
    }

    reverse(fibonacci(position, 0, 1, List[Int]()))
  }


  def addElementsOfTwoList(inputListOne: List[Int], inputListTwo: List[Int]): List[Int] = {

    val listWithPairs = inputListOne.zip(inputListTwo)

    listWithPairs.map(pair => pair._1 + pair._2)

  }

  def calculateArea(shape: String, sideOne: Int, sideTwo: Int): String = {
    def area(sideOne: Int, sideTwo: Int, area: (Int, Int) => Int) = area(sideOne, sideTwo)

    shape.toLowerCase match {
      case "rectangle" | "parallelogram" =>
        val result = area(sideOne, sideTwo, (a, b) => a * b)
        s"Area of $shape is $result"

      case "rhombus" =>
        val result = area(sideOne, sideTwo, (a, b) => a * b / 2)
        s"Area of $shape is $result"

      case _ => s"Not defined yet for $shape"
    }


  }

  def findKthElement(inputList: List[Int], pos: Int): Int = {

      inputList match {
        case head :: tail =>
          pos match {
            case 0 => head
            case x if x > 0 => findKthElement(tail, pos - 1)

          }
        case Nil => -1
      }



  }


  def length(inputList: List[Int]): Int = {
    def listLength(inputList: List[Int], pos: Int): Int = {
      inputList match {
        case Nil => pos
        case _ :: tail => listLength(tail, pos + 1)
      }
    }

    listLength(inputList, 0)

  }

  def reverse(inputList: List[Int]): List[Int] = {
    def reverseList(inputList: List[Int], outputList: List[Int]): List[Int] = {
      inputList match {
        case Nil => outputList
        case head :: tail => reverseList(tail, head :: outputList)
      }
    }

    reverseList(inputList, List[Int]())

  }

}