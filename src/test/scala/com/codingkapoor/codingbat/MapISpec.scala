package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class MapISpec extends FlatSpec with Matchers {

  """Method "mapBully"""" should """modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.""" in {
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1", "b" -> "2")) should equal(Map("b" -> "1", "a" -> ""))
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1")) should equal(Map("b" -> "1", "a" -> ""))
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1", "b" -> "2", "c" -> "3")) should equal(Map("b" -> "1", "a" -> "", "c" -> "3"))
  }

  """Method "mapShare"""" should """modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.""" in {
    MapI.mapShare(scala.collection.mutable.Map("a" -> "1", "b" -> "2", "c" -> "3")) should equal(Map("a" -> "1", "b" -> "1"))
    MapI.mapShare(scala.collection.mutable.Map("b" -> "1", "c" -> "2")) should equal(Map("b" -> "1"))
    MapI.mapShare(scala.collection.mutable.Map("b" -> "1", "c" -> "2", "d" -> "3")) should equal(Map("b" -> "1", "d" -> "3"))
  }

  """Method "mapAB"""" should """modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".""" in {
    MapI.mapAB(scala.collection.mutable.Map("a" -> "1", "b" -> "2")) should equal(Map("a" -> "1", "b" -> "2", "ab" -> "12"))
    MapI.mapAB(scala.collection.mutable.Map("a" -> "1")) should equal(Map("a" -> "1"))
    MapI.mapAB(scala.collection.mutable.Map("b" -> "2")) should equal(Map("b" -> "2"))
  }

  """Given a map of food keys and topping values, method "topping1"""" should """modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".""" in {
    MapI.topping1(scala.collection.mutable.Map("ice cream" -> "peanuts")) should equal(Map("bread" -> "butter", "ice cream" -> "cherry"))
    MapI.topping1(scala.collection.mutable.Map("bread" -> "butter")) should equal(Map("bread" -> "butter"))
    MapI.topping1(scala.collection.mutable.Map("pancake" -> "syrup")) should equal(Map("bread" -> "butter", "pancake" -> "syrup"))
  }

}
