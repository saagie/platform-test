#!/bin/bash

echo -e "init\n"

hdfs dfs -rm /tmp/test.txt

echo -e "\nexecute ls command on hdfs\n"

hdfs dfs -ls /  2>&1

echo -e "\nexecute put file command on hdfs\n"
hdfs dfs -put test.txt /tmp/test.txt 2>&1

echo -e "\nexecute cat command on hdfs\n"
hdfs dfs -cat /tmp/test.txt 2>&1
