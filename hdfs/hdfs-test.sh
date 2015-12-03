#!/bin/bash
set -e

echo -e "\nexecute ls command on hdfs\n"

hdfs dfs -ls /  2>&1

echo -e "OK\n"

echo -e "\nexecute put file command on hdfs\n"
hdfs dfs -put -f test.txt /tmp/test.txt 2>&1

echo -e "OK\n"

echo -e "\nexecute cat command on hdfs\n"
hdfs dfs -cat /tmp/test.txt 2>&1

echo -e "TEST OK\n"

