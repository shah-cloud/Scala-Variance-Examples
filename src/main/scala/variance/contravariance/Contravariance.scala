package variance.contravariance

import variance.classhierarchy.{Animal, Dog}

object Contravariance extends App {

  val dogContainer: Container[Dog] = new Container[Animal](new Dog)

  println(dogContainer.animal)

}
