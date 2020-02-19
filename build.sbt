lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-example-project",
    description := "Example sbt project that compiles using Dotty",
    version := "0.1.0",

    scalaVersion := "0.22.0-RC1"
  )

organization := "com.typesafe.sbt"
name := "sbt-git"
licenses := Seq(("BSD-2-Clause", url("https://opensource.org/licenses/BSD-2-Clause")))
description := "An sbt plugin that offers git features directly inside sbt"
developers := List(Developer("jsuereth", "Josh Suereth", "joshua suereth gmail com", url("http://jsuereth.com/")))
startYear := Some(2011)
homepage := scmInfo.value map (_.browseUrl)
scmInfo := Some(ScmInfo(url("https://github.com/sbt/sbt-git"), "scm:git:git@github.com:sbt/sbt-git.git"))

crossSbtVersions := List("0.13.17", "1.1.5")

libraryDependencies ++= Seq(
  "org.eclipse.jgit" % "org.eclipse.jgit" % "4.9.0.201710071750-r",
  "com.michaelpollmeier" % "versionsort" % "1.0.0"
)
