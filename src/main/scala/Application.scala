
object Application extends App {
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
  print(s"Fibonacci till $value ${Operations.fibonacciUsingTailRecursion(value)} \n ")
  val position = 5
  val factorialNum = 5
  val shape = "rectangle"
  val sideOne = 10
  val sideTwo = 20
  print(s"${Operations.calculateArea(shape, sideOne, sideTwo)}\n")

  print(s" \n Double elements of $inputListOne is ${Operations.doubleListElements(inputListOne)} \n")

  print(s" \n Reverse elements of $inputListOne is ${Operations.reverse(inputListOne)} \n")

  print(s" \n length of $inputListOne is ${Operations.length(inputListOne)} \n")


}
