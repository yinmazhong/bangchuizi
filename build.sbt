ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.dahuodong"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
val gigahorse = "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1"
val playJson = "com.typesafe.play" %% "play-json" % "2.6.9"



lazy val bangchuzi = (project in file("."))
  .aggregate(bangchuziCore)
  .dependsOn(bangchuziCore)
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "BangChuiZi",
    libraryDependencies += scalaTest % Test,
  )


lazy val bangchuziCore = (project in file("bangchuziCore"))
  .settings(
    name := "BangChuiZi core",
    libraryDependencies ++= Seq(gigahorse, playJson),
    libraryDependencies += scalaTest % Test,
  )

