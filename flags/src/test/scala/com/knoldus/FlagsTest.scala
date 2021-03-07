package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FlagsTest extends AnyFlatSpec {

  val flagsTest = new Flags()
  "help" should "return the description of all the flags" in {
    val result = flagsTest.help()
    val flagsDescription = Map("--version" -> "get the version of application", "--help" -> "Shows description of flag", "--greet" -> "print's the greeting randomly in different language")

    assert(result == flagsDescription.map { case (k, v) => s" $k => $v " }.mkString("Usage parsing flag\n", "\n", ""))
  }

  "version" should "return the version of the application" in{

    val result = flagsTest.version()

    assert(result=="version = 1.0")
  }

  "printWelcome with english" should "return the welcome greeting in english" in{

    val result = flagsTest.printWelcome("english")

    assert(result=="Welcome")
  }

  "printWelcome with spanish" should "return the greeting in spanish" in{

    val result = flagsTest.printWelcome("spanish")

    assert(result=="Bienvenido")
  }

  "printWelcome with french" should "return the welcome greeting in french" in{

    val result = flagsTest.printWelcome("french")

    assert(result=="Bienvenue")
  }
}
