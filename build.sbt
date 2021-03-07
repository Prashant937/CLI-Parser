name := "Assignmentcli"

version := "1.0"

scalaVersion := "2.13.5"


lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test

lazy val root = project.in(file(".")).aggregate(parsing, flags)

lazy val parsing = project.in(file("parsing"))
  .settings(
    libraryDependencies += scalaTest

  )
  .dependsOn(flags)
  .enablePlugins(JavaAppPackaging)


lazy val flags = project.in(file("flags"))
  .settings(
    libraryDependencies += scalaTest
  )