package fr.saagie.mesos

/**
  * Created by madhu on 30/9/14.
  */

import org.apache.mesos.MesosSchedulerDriver
import org.apache.mesos.Protos.FrameworkInfo

/**
  * Client program which will launch shell commands on cluster
  * Read README.md for example invocation.
  */
object DistributedShell extends App {
  if (args.length != 2){
    println("hostname commandline")
  }else {
    val host = args(0)
    val command = List(args(1))

    val framework = FrameworkInfo.newBuilder.
      setName("DistributedShell").
      setUser("").
      setRole("*").
      setCheckpoint(false).
      setFailoverTimeout(0.0d).
      build()

    //create instance of schedule and connect to mesos
    val scheduler = new ScalaScheduler
    //submit shell commands
    scheduler.submitTasks(command: _*)
    val mesosURL = host
    val driver = new MesosSchedulerDriver(scheduler, framework, mesosURL)
    //run the driver
    driver.run()
  }

}
