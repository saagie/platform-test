#!/bin/bash

echo -e "init\n"

hdfs dfs -rm /tmp/test

echo -e "\nexecute ls command on hdfs\n"

hdfs dfs -ls /  2>&1

echo -e "\nexecute put file command on hdfs\n"
hdfs dfs -put test /tmp/test 2>&1

echo -e "\nexecute cat command on hdfs\n"
hdfs dfs -cat /tmp/test 2>&1
