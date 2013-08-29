import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "apitest"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )

  val Repos = Seq(
    "anormcypher" at "http://repo.anormcypher.org/",
    "Mandubian repository snapshots" at "https://github.com/mandubian/mandubian-mvn/raw/master/snapshots/",
    "Mandubian repository releases" at "https://github.com/mandubian/mandubian-mvn/raw/master/releases/"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    resolvers ++= Repos,
    libraryDependencies ++= Seq(
      "play" %% "play-json" % "2.2-SNAPSHOT",
      "org.anormcypher" %% "anormcypher" % "0.4.0",
      "org.scalaj" %% "scalaj-http" % "0.3.9" exclude("junit", "junit"),
      "net.databinder" %% "dispatch-http" % "0.8.10"
    )
  )
}
