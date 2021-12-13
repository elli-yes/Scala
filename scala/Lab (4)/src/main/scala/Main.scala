package Lab_ex4

object Main extends App {
  println(Typeclasses.testReversableString("Deda"))
  println(Typeclasses.testSmashInt(1, 1))
  println(Typeclasses.testSmashDouble(2, 2))
  println(Typeclasses.testSmashString("Hellicopter, ", "Hellicopter!"))
}