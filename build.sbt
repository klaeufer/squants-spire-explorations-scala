name := "misc-explorations-scala"

version := "0.0.1"

scalaVersion := "2.11.6"

resolvers += 
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.2",
  "com.squants" %% "squants"  % "0.5.2-SNAPSHOT",
  "org.spire-math" %% "spire" % "0.10.1",
  "org.scalatest" %% "scalatest" % "2.2.5" % Test,
  "org.scalacheck" %% "scalacheck" % "1.12.3" % Test
)

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

initialCommands in console := """
                                |import scalaz._
                                |import Scalaz._
                                |import spire.implicits._
                                |import spire.math._
                                |""".stripMargin
