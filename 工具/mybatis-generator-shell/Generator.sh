#!/bin/sh


LIBS_PATH=libs
CONFIG_PATH=config/config.xml

export LIBS_PATH

for file in ${LIBS_PATH}/*.jar;
do CP=${CP}:$file;
done

CLASSPATH="${CP}"
export CLASSPATH

JAVA_OPTIONS=" -Dfile.encoding=UTF-8"
MEM_ARGS="-Xms128m -Xmx512m"


${JAVA_HOME}/bin/java  ${JAVA_OPTIONS} org.mybatis.generator.api.ShellRunner -configfile ${CONFIG_PATH} -overwrite
