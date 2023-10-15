Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val commonSettings = Seq(
  scalaVersion := "3.3.1",
  organization := "org.alexr",
  version := "0.1.0",
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.8.0",
  )
)

lazy val j11 = (project in file("j11"))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
