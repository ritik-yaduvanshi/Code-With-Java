package Example5;

import java.util.Arrays;
import java.util.Scanner;

class Car{
    private String carName;
    private String carColor;
    private int carPrice;
    private double carMilage;

    public void setCarName(String carName){
        this.carName = carName;
    }
    public String getCarName(){
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public double getCarMilage() {
        return carMilage;
    }

    public void setCarMilage(double carMilage) {
        this.carMilage = carMilage;
    }

    public void carInformation(){
        System.out.println("Car Name : "+carName);
        System.out.println("Car Price : "+carPrice);
        System.out.println("Car Color : "+carColor);
        System.out.println("Car Milege : "+carMilage);
    }
}



class Student{
    private String studentName;
    private String studentDob;
    private int age;
    private String course;
    private int marks;

    public Student(){};
    public Student (String name,String dob,int age,String course,int mark){
        studentName = name;
        studentDob = dob;
        this.age = age;
        this.course = course;
        marks = mark;
    }

    public void displaySlip(){
        System.out.println(studentName+"\n"+studentDob+"\n"+age+"\n"+course+"\n"+marks);
    }

}

class Calculator{
    public int addition(int num1,int num2){
        return num1+num2;
    }
    public int subtract(int num1,int num2){
        return num1-num2;
    }
    public int multiplay(int num1,int num2){
        return num1 * num2;
    }
    public int div(int num1,int num2){
        int res = -1;
        if(num1>num2){
            res = num1/num2;
        }
        return res;
    }
}

public class Solutions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
      //Car Deatails
        System.out.println("Enter the Car Details !");
        Car car = new Car();
        System.out.println("Enter the Car Name");
        car.setCarName(scan.nextLine());
        System.out.println("Enter the Car Price");
        car.setCarPrice(scan.nextInt());
        System.out.println("Enter the Car Milege");
        car.setCarMilage(scan.nextDouble());
        scan.nextLine();
        System.out.println("Enter the Car Color");
        car.setCarColor(scan.nextLine());

        car.carInformation();

      //Student Rejistration
        Student student = new Student("ABCD","01/04/2003",12,"B.tech",85);
        student.displaySlip();


       // Calculator
        Calculator calculator = new Calculator();
        System.out.println("Enter the first Num:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second NUmber");
        int num2 = scan.nextInt();
        System.out.println("Enter the sign Of Operation(Hint : +,-,*,/)");
        char sign = scan.next().charAt(0);

        switch (sign){
            case '+':
                System.out.println(calculator.addition(num1,num2));
                break;
            case '-':
                System.out.println(calculator.subtract(num1,num2));
                break;
            case '*':
                System.out.println(calculator.multiplay(num1,num2));
                break;
            case '/':
                System.out.println(calculator.div(num1,num2));
                break;
            default:
                System.out.println("Enter the valid Sign");
        }

    }
}
