#Dokerfile --> MavenTutorial

#base image
FROM ubuntu:latest
MAINTAINER Tiago Coelho

#update os
RUN apt-get update

#install Java
RUN mkdir -p /opt/jdk \
&& cd /opt \
&& wget --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn/java/jdk/8u152-b16/aa0333dd3019491ca4f6ddbe78cdb6d0/jdk-8u152-linux-x64.tar.gz \
&& tar -zxf jdk-8u152-linux-x64.tar.gz -C /opt/jdk \
&& update-alternatives --install /usr/bin/java java /opt/jdk/jdk1.8.0_152/bin/java 100 \
&& update-alternatives --install /usr/bin/javac javac /opt/jdk/jdk1.8.0_152/bin/javac 100

ENV JAVA_HOME /opt/jdk

#install Maven




