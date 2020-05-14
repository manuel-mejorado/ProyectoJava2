set projectLocation=C:\Users\Manuel.Mejorado\Documents\GitHub\ProyectoJava2
set classpath=%projectLocation%\lib\*;%projectLocation%\bin
echo %classpath% 
java org.testng.TestNG %projectLocation%\TestNGRun.xml