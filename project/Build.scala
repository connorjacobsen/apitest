import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "apitest"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    // Add AnomCypher dependency
    "org.anormcypher" %% "anormcypher" % "0.4.2"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add AnormCypher resolvers
    resolvers ++= Seq(
      "anormcypher" at "http://repo.anormcypher.org/",
      "Mandubian repository snapshots" at "https://github.com/mandubian/mandubian-mvn/raw/master/snapshots/",
      "Mandubian repository releases" at "https://github.com/mandubian/mandubian-mvn/raw/master/releases/"
    )    
  )

}
