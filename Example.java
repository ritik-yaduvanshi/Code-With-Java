/*
Class - A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.

Object - Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging
 their tail, barking, eating. An object is an instance of a class.

 Methods - A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written,
 data is manipulated and all the actions are executed.

 Write you first program on Notepad :
 Example : Source Code

 public class Student{
    public static void main(String[] args){
        System.out.println("Hello, Student!");
    }
 }

 save this file Student.java   (.java is used for java code) save in any folder (use cd foldername)
 C:\> javac Student.java
 C:\> java Student
 Output : Hello, Student!

*/

//define class using class keyword

class Dog{ //Dog is class Name
    //State of Dog Class
    String dogName = "Tomy";
    String color = "Black";

    //behaviour of Dog Class
    void barking(){};
    void eating(){};
}

public class Example { //Main Class
    public static void main(String[] args) { // Main Method of Example Class
        /*
        public - Access Modifer
        static - Keyword
        void - return type
        main - Method name
        args - array Name
        String[] - data type of Array
        */

        //Identifiers : All Java components require names. Names used for classes, variables, and methods are called identifiers.
        //Note : A key word cannot be used as an identifier.

        //valid Identifiers :
        int salary = 200;
        long $dollars = 500;
        String _name = "Ritik";
        long _1_value = 23445555;

        //Invalid Identifiers : 123abc, -salary

        //Java Modifiers :
        /*
        Access Modifers : default,public,private,protected
        Non Access Modifiers : final, abstract, strictfp
         */
    }
}
