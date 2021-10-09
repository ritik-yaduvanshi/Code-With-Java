/*
Decision making structures have one or more conditions to be evaluated
 or tested by the program, along with a statement or statements that are
  to be executed if the condition is determined to be true, and optionally,
   other statements to be executed if the condition is determined to be false.
1. if statement :
"An if statement consists of a boolean expression followed by one or more statements."
2. if..else statement:
"An if statement can be followed by an optional else statement,
which executes when the boolean expression is false."
3.nested-if statement:
"You can use one if or else if statement inside another if or else if statement(s)."
4.switch statement:
"A switch statement allows a variable to be tested for equality against a list of values"
 */
public class DecisionMaking {
    public static void main(String[] args) {
        //-------------if---------------------------
        int y = 10;
        if( y < 20 ){
            System.out.print("This is if statement");
        }
        //---------------if-else----------------------
        int x1 = 30;
        if( x1 < 20 ){
            System.out.print("This is if statement");
        }else{
            System.out.print("This is else statement");
        }
        //----------------if-else-if-else--------------
        int x = 30;
        if( x == 10 ){
            System.out.print("Value of X is 10");
        }else if( x == 20 ){
            System.out.print("Value of X is 20");
        }else if( x == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("This is else statement");
        }
        //---------------Nested if---------------------
        int x2 = 30;
        int y2 = 10;
        if( x2 == 30 ){
            if( y2 == 10 ){
                System.out.print("X = 30 and Y = 10");
            }
        }
        //--------------switch-case------------------
        char grade = 'C';
        switch(grade)
        {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
