:: Generator自动生成文件
@echo off

setlocal enabledelayedexpansion

set CONFIG_PATH=config/config.xml
set JAR_EXECUTE_MAIN=org.mybatis.generator.api.ShellRunner

set CLSPATH=.
for %%j in (libs/*.jar) do (
set CLSPATH=!CLSPATH!;%cd%\libs\%%j
)

echo on
SET CLASSPATH=%CLSPATH%;%CLASSPATH%
java -cp "%CLASSPATH%" "%JAR_EXECUTE_MAIN%"  -configfile "%CONFIG_PATH%" -overwrite

endlocal

pause
