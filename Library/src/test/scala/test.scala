import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

class Library extends munit.FunSuite {
  test("two plus two is four") { // This is how a test is declared
    assertEquals(2 + 2, 4)
  }

}

object StringProperties extends Properties("String") {
  property("reverse") = forAll { s: String =>
    s.reverse.reverse == s
  }
}