// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.creditkarma",
      scalaVersion := "2.11.8",
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.0.0" % "it,test")
    ))
  )
