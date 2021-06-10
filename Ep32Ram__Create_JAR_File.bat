REM-----------------------------
REM Ep32Ram
REM-----------------------------
echo off
cls

REM SET "dirlocation=%JAVA_HOME%\bin\"


:STARTCOMPILE
echo "%dirlocation%"
del *.class /Q
echo Create the Manifest file:
echo Main-Class: Ep32Ram >MANIFEST.MF
echo .

echo Compile the Java code:
"%dirlocation%javac.exe" ..\00__common_code\Network.java
copy ..\00__common_code\Network*.class .
"%dirlocation%javac.exe" ..\00__common_code\Moose_Utils.java
copy ..\00__common_code\Moose_Utils*.class .
REM "%dirlocation%javac.exe" ..\00__common_code\BuildNumberIncrementer.java
REM copy ..\00__common_code\BuildNumberIncrementer*.class .


REM Increment the Build Number
REM "%dirlocation%java.exe" BuildNumberIncrementer

"%dirlocation%javac.exe" "Ep32Ram.java"

echo .
echo Build the JAR file:
REM add the BuildNumber.ini to JAR:
"%dirlocation%jar.exe" cfm "Ep32Ram.jar" MANIFEST.MF BuildNumber.ini *.class ..\icons\*.gif ..\icons\*.png  "Ep32Ram*.txt"

REM
del *.class
del ..\00__common_code\*.class
REM del *.gif

:END
echo .
echo Finished!
pause