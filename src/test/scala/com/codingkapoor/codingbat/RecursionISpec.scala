package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class RecursionISpec extends FlatSpec with Matchers {

  """Given n of 1 or more, method "factorial"""" should """return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).""" in {
    RecursionI.factorial(1) should equal(1)
    RecursionI.factorial(2) should equal(2)
    RecursionI.factorial(3) should equal(6)
  }

  """We have a number of bunnies and each bunny has two big floppy ears. Method bunnyEars""" should """compute the total number of ears across all the bunnies recursively (without loops or multiplication).""" in {
    RecursionI.bunnyEars(0) should equal(0)
    RecursionI.bunnyEars(1) should equal(2)
    RecursionI.bunnyEars(2) should equal(4)
  }

  """Method "fibonacci"""" should """returns the nth fibonacci number, with n=0 representing the start of the sequence.""" in {
    RecursionI.fibonacci(0) should equal(0)
    RecursionI.fibonacci(1) should equal(1)
    RecursionI.fibonacci(2) should equal(1)
  }

  """We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Method "bunnyEars2"""" should """return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).""" in {
    RecursionI.bunnyEars2(0) should equal(0)
    RecursionI.bunnyEars2(1) should equal(2)
    RecursionI.bunnyEars2(2) should equal(5)
  }

  """We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Method "triangle"""" should """compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.""" in {
    RecursionI.triangle(0) should equal(0)
    RecursionI.triangle(1) should equal(1)
    RecursionI.triangle(2) should equal(3)
  }

  """Given a non-negative int n, method "sumDigits"""" should """return the sum of its digits recursively (no loops).""" in {
    RecursionI.sumDigits(126) should equal(9)
    RecursionI.sumDigits(49) should equal(13)
    RecursionI.sumDigits(12) should equal(3)
  }

  """Given a non-negative int n, method "count7"""" should """return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).""" in {
    RecursionI.count7(717) should equal(2)
    RecursionI.count7(7) should equal(1)
    RecursionI.count7(123) should equal(0)
  }

  """Given a non-negative int n, method "count8"""" should """compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.""" in {
    RecursionI.count8(8) should equal(1)
    RecursionI.count8(818) should equal(2)
    RecursionI.count8(8818) should equal(4)
  }

  """Given base and n that are both 1 or more, method "powerN"""" should """compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).""" in {
    RecursionI.powerN(3, 1) should equal(3)
    RecursionI.powerN(3, 2) should equal(9)
    RecursionI.powerN(3, 3) should equal(27)
  }

  """Given a string, method "countX"""" should """compute recursively (no loops) the number of lowercase 'x' chars in the string.""" in {
    RecursionI.countX("xxhixx") should equal(4)
    RecursionI.countX("xhixhix") should equal(3)
    RecursionI.countX("hi") should equal(0)
  }

  """Given a string, method "countHi"""" should """compute recursively (no loops) the number of times lowercase "hi" appears in the string.""" in {
    RecursionI.countHi("xxhixx") should equal(1)
    RecursionI.countHi("xhixhix") should equal(2)
    RecursionI.countHi("hi") should equal(1)
  }

  """Given a string, method "changeXY"""" should """compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.""" in {
    RecursionI.changeXY("codex") should equal("codey")
    RecursionI.changeXY("xxhixx") should equal("yyhiyy")
    RecursionI.changeXY("xhixhix") should equal("yhiyhiy")
  }

}
