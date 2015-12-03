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

echo -e "\nexecute ls via web api on hdfs\n"
curl -i "http://localhost:50070/webhdfs/v1/tmp/?op=LISTSTATUS"

echo -e "\nexecute put file via web api on hdfs\n"
curl -i -L -X PUT -T test.txt "http://localhost:50070/webhdfs/v1/tmp/test.txt?op=CREATE&overwrite=false"


echo -e "\nexecute cat via web api on hdfs\n"
curl -i -L "http://localhost:50070/webhdfs/v1/tmp/test.txt?op=OPEN"

echo -e "TEST OK\n"

