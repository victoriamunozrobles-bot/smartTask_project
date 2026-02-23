rd /s /q bin
javac -d bin src/main/*.java
javac -cp "lib/*;bin" -d bin src/test/*.java
java -cp "lib/*;bin" org.junit.runner.JUnitCore test.GestorTareasTest