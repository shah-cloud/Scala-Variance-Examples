package variance.invariance

import variance.classhierarchy.{Animal, Cat}

object Invariance extends App {

  // The below line of code will give an compile time error
  val animalContainer: Container[Animal] = new Container[Cat](new Cat)

}
