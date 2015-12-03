import sbt.Keys._

name := "SparkTest"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.5.0" % "provided"