# Code covering compiling and running java from the terminal 

Covers the following:
* Create a package with Main.java running hello world
* Create classes as the output directory where the .class files should go
* Run the following to compile the java code

        $ javac -d classes src/com/basics/Main.java
* In the above, '-d' specifies where to place the .class files
* Check the tree structure which should look like the following

        $ tree .
        .  
        ├── README.md  
        ├── classes  
        │   └── com  
        │        └── basics  
        │            └── Main.class  
        └── src  
            └── com
                └── basics  
                    └── Main.java  
  
* Now, run the java code using the below command specifying the classpath

      $ java -classpath classes com.basics.Main
      Hello world from the terminal

* In the above, the classpath argument specifies where to find the Main class