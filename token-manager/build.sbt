name := "token-manager"

version := "1.0"

scalaVersion := "2.11.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.7"
  val akkaStreamV = "1.0-M2"
  val sprayJsonV = "1.3.1"
  val reactiveMongoV = "0.10.5.0.akka23"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaStreamV,
    "org.reactivemongo" %% "reactivemongo" % reactiveMongoV
  )
}

Revolver.settings