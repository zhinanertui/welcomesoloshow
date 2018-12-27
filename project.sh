#!/usr/bin/env bash

# 拉去代码
# 关闭tomcat
ps -ef |grep tomcat |grep -v grep |awk '{print $2}'|xargs kill 9
# 删除ROOT 代码
rm -rf /home/tomcat/apache-tomcat-8.5.35/webapps/welcomesoloshow/ROOT
git pull origin master
mvn clean install
cd /home/tomcat/apache-tomcat-8.5.35/webapps/welcomesoloshow/
cp /home/workspace/welcomesoloshow/target/ROOT.war .
unzip ROOT.war -d ROOT
rm ROOT.war
sh /home/tomcat/apache-tomcat-8.5.35/bin/startup.sh
