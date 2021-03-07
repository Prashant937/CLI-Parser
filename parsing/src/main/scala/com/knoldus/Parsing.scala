package com.knoldus

import scala.util.Random

class Parsing {

  def parsing(flags: Array[String]): String = {

    if (flags.length == 0) return (new Flags).help()

    else if ((flags.length == 1) && (flags(0).startsWith("-"))) {
      flags(0) match {
        case "--version" => return (new Flags).version()
        case "--help" => return (new Flags).help()
        case "--greet" => {
          val language = Array("english", "spanish", "french")
          val rand = new Random(System.currentTimeMillis())
          val random_index = rand.nextInt(language.length)
          val resultLang = language(random_index)
          return (new Flags).printWelcome(resultLang)
        }
        case _=>return (new Flags).help()
      }
    }
    (new Flags).help()
  }

}
