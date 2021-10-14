/*
 package : In simple words, it is a way of categorizing the classes and interfaces.
 Class : A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.
 Object : Objects have states and behaviors.with Object we can access methods,variables etc.

 Creation of Object----

 Classname objectname = new(keyword) ConstructorofClass;
 Ex : Student student = new Student();

 A class can contain any of the following variable types.
 1.Local variable
 2.Instance Variable
 3.Class or Static Variable

 Local variables: Variables defined inside methods, constructors or blocks are called local variables.
 The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.

 Instance variables: Instance variables are variables within a class but outside any method.
 These variables are initialized when the class is instantiated. Instance variables can be accessed
 from inside any method, constructor or blocks of that particular class.you may access through a object.

 Class variables: Class variables are variables declared within a class, outside any method, with the static keyword.

 Constructor : Every class has a constructor. If we do not explicitly write a constructor for a class,
 the Java compiler builds a default constructor for that class.
 Each time a new object is created, at least one constructor will be invoked. The main rule of constructors
 is that they should have the same name as the class. A class can have more than one constructor.It is used to
 initialise an Instance variable of Class.

 Modifiers : Modifiers are keywords that you add to those definitions to change their meanings
 1.Access Modifiers : public , private , protected
 2.Non Access Modifiers : final,abstract,strictfp

 More detail about this go through a ppt or some references or websites

 Methods : A method is a block of code or collection of statements or a set of code grouped together to perform
 a certain task or operation. It is used to achieve the reusability of code. We write a method once and use
 it many times. We do not require to write code again and again. It also provides the easy modification and readability of code,

  There is two type of methods and Constructors in java
  1.Parametrised Method or Constructor
  2.Non Parametrised Method or Constructor

  Getter() and Setter() is used to access a private Instance variables of the class

 */

class Student{
    String name;//Instance variable
    static int age;//class or static variable

    public Student(){ //Non Parametrised Constructor

    }
    public Student(String name,int age){ //Parametrised Constructor
        this.name = name;
        Student.age = age;
    }
    public void displayStudentData(){ //method
        System.out.println(name);
        System.out.println(age);
    }
}

class Employee{
    private String name; //Instance Variable
    private int age;
    private double salary;
    private String departmentName;

    public String getName() { //getter method
        return name;
    }

    public void setName(String name) { //setter method
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

public class Main{
    public static void main(String[] args) {
        Employee employee = new Employee();//Employee object Creation
        employee.setName("ABCD");
        employee.setAge(20);
        employee.setSalary(20000.00);
        employee.setDepartmentName("Computer Science");

        //Display Employee Data
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getSalary());
        System.out.println(employee.getDepartmentName());
        
        //Student object creation
        Student student = new Student("Rohan",21);//Initialising Student Instance Using Constructor
        student.displayStudentData();//displaying Student Data
        
    }
}
