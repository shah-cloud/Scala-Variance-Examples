package variance.covariance

import variance.classhierarchy.{Animal, Cat, Dog}

object Covariance extends App {

  val dogContainer: Container[Dog] = new Container[Dog](new Dog)

  val animalContainer: Container[Animal] = new Container[Cat](new Cat)

  println(animalContainer.animal)

}
