// enable the plugin that’s in 'project/plugins.sbt'
enablePlugins(ScalaJSPlugin)

// this states that this is a Scala.js application with a `main` method
scalaJSUseMainModuleInitializer := true

Compile/mainClass := Some("alvin.Laminar101")

lazy val root = project
    .in(file("."))
    .settings(
        name := "Laminar101",
        version := "0.1",
        scalaVersion := "2.13.8"
    )

// note: don’t need to specify the Airstream or Scala.js versions here,
// they are dependencies of Laminar
libraryDependencies ++= Seq(
    "com.raquo" %%% "laminar" % "0.14.2"
)
