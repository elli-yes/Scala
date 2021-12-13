object Main extends App {
  println(Strings.testUppercase("banana"))
  println(Strings.testInterpolations("Egor", 20))
  println(Strings.testComputation(1, 1))
  println(Strings.testTakeTwo("Very looooongrun"))
  println()

  println(Adts.testGetNth(List(1, 2, 3), 1))
  println(Adts.testDouble(Some(2)))
  println(Adts.testIsEven(2))
  println(Adts.testSafeDivide(4, 0))
  println(Adts.testGoodOldJava(_.charAt(100), ""))
  println()

  println(Maps.testGroupUsers(Seq(Maps.User("Vladimir", 60), Maps.User("Putin", 30), Maps.User("Molodec", 20))))
  println(Maps.testNumberFrodos(Map("first" -> Maps.User("Adam", 10), "second" -> Maps.User("John", 15))))
  println(Maps.testUnderaged(Map("first" -> Maps.User("Jack", 20), "second" -> Maps.User("Bill", 36))))
  println()

  println(Sequence.testLastElement(Seq(1, 2, 3)))
  println(Sequence.testZip(Seq(1, 2), Seq(2, 3)))
  println(Sequence.testForAll(Seq(1, 2, 3, 4))(_ % 2 == 0))
  println(Sequence.testPalindrom(Seq(1, 2, 1)))
  println(Sequence.testFlatMap(Seq(1, 2, 3))(item => Seq(item, item * item)))
}