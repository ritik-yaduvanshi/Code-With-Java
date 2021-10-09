import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        System.out.println("Input integer");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n> 100 && n<500){
            if (n%2==0){
                System.out.println("Even number");
            }
            else{
                System.out.println("Odd Number");
            }
        }
        else {
            System.out.println("Number is neither greater than 100 nor less than 500.");
        }
    }

}

