import org.apache.spark.{SparkConf, SparkContext}

object TestSpark {

  def main(args: Array[String]) {

    val sc = new SparkContext(new SparkConf()
      .setAppName("TestSpark")
      .set("spark.executor.memory", "512M")
      .set("spark.mesos.mesosExecutor.cores", "1")
      .set("spark.speculation", "true")
      .set("spark.mesos.coarse", "false")

    )
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    sqlContext.sql("SELECT 1")
  }
}
