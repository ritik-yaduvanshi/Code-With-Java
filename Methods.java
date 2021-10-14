import java.util.Scanner;
public class Methods {
    
    public void display(){
        //Non static and non Parametrised Method
        System.out.println("This is Non Static and Non Argument Method");
    }
    
    public void sumOfTwoNum(int num1,int num2){//Non Static method and Parametrised
        System.out.println("Sum Of Two Number : "+(num1+num2));
    }
    
    public static int Multiply(int num,int num2){
        //static and parametrised method it will return a value which is Integer type
        int res = num * num2;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        
        //to access Non static method you will have to create a object
        Methods obj = new Methods();
        obj.display();
        obj.sumOfTwoNum(num,num2);
        
        int val = Multiply(num,num2);
        System.out.println(val);
    }
}
