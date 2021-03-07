package com.knoldus

object MainEntry {
  def main(args: Array[String]): Unit = {
    println((new Parsing).parsing(args))
  }
}
