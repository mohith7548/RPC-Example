# RMI Example

1. Goto `src` folder.

2. Convert thejava code to executable classes
    `javac *.java -d out`

3. Goto `out` folder
    `cd out/`

4. Create stub code
    `rmic MathFunRemote`

5. Start rmi-registry on port 5000
    `rmiregistry 5000`

6. Open New terminal & start server
    `java MyServer`

7. Open New terminal & start client
    `java MyClient`