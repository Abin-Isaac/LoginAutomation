@echo off
setlocal

:: Set paths (edit if versions differ)
set SELENIUM_HOME=%USERPROFILE%\.m2\repository\org\seleniumhq\selenium\selenium-java\4.18.1
set WDM_HOME=%USERPROFILE%\.m2\repository\io\github\bonigarcia\webdrivermanager\5.8.0

:: Optional: local lib folder if jars copied manually
set LOCAL_LIB=lib

:: Build classpath with both Maven repo jars and local lib (if used)
set CLASSPATH=.;%SELENIUM_HOME%\*;%WDM_HOME%\*;%LOCAL_LIB%\*

:: Create bin directory if not exist
if not exist bin (
    mkdir bin
)

echo 🛠️ Compiling DemoUtils.java and PasswordReset_NoTestNG.java...

javac -cp "%CLASSPATH%" -d bin ^
src\test\java\com\abin\selenium\tdd\automation\utils\DemoUtils.java  ^
src\test\java\com\abin\selenium\tdd\automation\withouttestng\PasswordReset_NoTestNG.java

if %ERRORLEVEL% NEQ 0 (
    echo ❌ Compilation failed.
    pause
    exit /b %ERRORLEVEL%
)

echo 🚀 Running PasswordReset_NoTestNG.java...

java -cp "bin;%CLASSPATH%" com.abin.selenium.tdd.automation.withouttestng.PasswordReset_NoTestNG

pause
endlocal
