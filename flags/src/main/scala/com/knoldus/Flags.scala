package com.knoldus

class Flags {

  def help(): String ={
    val flagsDescription = Map("--version" -> "get the version of application", "--help" -> "Shows description of flag", "--greet" -> "print's the greeting randomly in different language")
    (flagsDescription.map { case (k, v) => s" $k => $v " }).mkString("Usage parsing flag\n", "\n", "")
  }
  def version(): String ={

    "version = 1.0"
  }

  def printWelcome(language:String): String ={
    val welcome= Map("english"-> "Welcome", "spanish"->"Bienvenido", "french"->"Bienvenue")
    welcome(language)
  }

}
