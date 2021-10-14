import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter percentage integers");
        int p = input.nextInt();
        if (p>90){
            System.out.println("Your Grade is A\nPerformance : Excellent");
        }
        else if(p>75 & p<90){
            System.out.println("Your Grade is B\nPerformance : Good");
        }
        else if(p < 75 & p > 60){
            System.out.println("Your Grade is C\nPerformance : Pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
