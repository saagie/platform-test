#Mesos hello world in scala

This repository contains code to run shell commands in a distributed manner using Apache mesos

#Building
    mvn clean install

#Running example
$MESOS_HOME refers to the mesos installation directory. Example need access mesos.so shared library which can be found
at /usr/lib/

    java -cp target/Mesos-0.0.1-SNAPSHOT.jar -Djava.library.path=/usr/lib/  fr.saagie.mesos.DistributedShell localhost:5050 "/bin/echo hello"

