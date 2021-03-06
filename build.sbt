name := "SparkKafkaCassandra"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.1.1"

libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.1.1"

libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.1.1"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.1.0"

libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector-demos_2.10" % "1.1.0-beta1"

libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector-embedded_2.10" % "1.1.0"
