package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ParsingTest extends AnyFlatSpec {
  val parsingTest = new Parsing()
  "help" should "return the description of all the flags" in {
    val argsTest = Array("--help")
    val result = parsingTest.parsing(argsTest)
    val flagsDescription = Map("--version" -> "get the version of application", "--help" -> "Shows description of flag", "--greet" -> "print's the greeting randomly in different language")

    assert(result == flagsDescription.map { case (k, v) => s" $k => $v " }.mkString("Usage parsing flag\n", "\n", ""))
  }

  "version" should "return the version of the application" in{

    val argsTest = Array("--version")
    val result = parsingTest.parsing(argsTest)

    assert(result=="version = 1.0")
  }
  "greet" should "return the greeting randomly in different language" in {
    val argsTest =Array("--greet")
    val result = parsingTest.parsing(argsTest)


  }

  "no argument" should "return the description" in {
    val argsTest = Array("--help")
    val result = parsingTest.parsing(argsTest)
    val flagsDescription = Map("--version" -> "get the version of application", "--help" -> "Shows description of flag", "--greet" -> "print's the greeting randomly in different language")

    assert(result == flagsDescription.map { case (k, v) => s" $k => $v " }.mkString("Usage parsing flag\n", "\n", ""))
  }

  "more than one argument" should "return the description" in {

    val argsTest = Array("--help")
    val result = parsingTest.parsing(argsTest)
    val flagsDescription = Map("--version" -> "get the version of application", "--help" -> "Shows description of flag", "--greet" -> "print's the greeting randomly in different language")

    assert(result == flagsDescription.map { case (k, v) => s" $k => $v " }.mkString("Usage parsing flag\n", "\n", ""))
  }



}
