

object Application {
  def main(args: Array[String]): Unit = {

    val firstMember = 10
    val secondMember = 20
    val thirdMember = 30
    val fourthMember = 40
    val inputListOne = List(firstMember, secondMember, thirdMember, fourthMember)
    val inputListTwo = List(firstMember, secondMember, thirdMember, fourthMember)

    print(" Sum Of List \n ")


    val outputList = Operations.addElementsOfTwoList(inputListOne, inputListTwo)
    print(outputList)
    val value = 5
    print(s" \nFibonacci till $value ${Operations.fibonacciUsingTailRecursion(value)} ")
    val position = 2
    val shape = "rectangle"
    val sideOne = 10
    val sideTwo = 20
    print(s"\n${Operations.calculateArea(shape, sideOne, sideTwo)}\n")

    print(s" \n Double elements of $inputListOne is ${Operations.doubleListElements(inputListOne)} \n")

    print(s" \n Reverse elements of $inputListOne is ${Operations.reverse(inputListOne)} \n")

    print(s" \n length of $inputListOne is ${Operations.length(inputListOne)} \n")

    print(s" \n element at $position of $inputListOne is ${Operations.findKthElement(inputListOne, position)}")
  }
}
