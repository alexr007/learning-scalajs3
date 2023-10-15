Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val commonSettings = Seq(
  scalaVersion := "3.3.1",
  organization := "org.alexr",
  version := "0.1.0",
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.8.0"
  )
)

lazy val j11 = (project in file("j11"))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)

lazy val j12 = (project in file("j12"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    commonSettings,
    // https://www.scala-js.org/doc/project/module.html
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      // git clone git@github.com:creativescala/chartreuse.git
      // sbt +publishLocal
      "org.creativescala" %%% "chartreuse-core" % "0.1-cefd1cf-20231015T123107Z-SNAPSHOT"
    )
  )
