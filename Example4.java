/*
A loop statement allows us to execute a statement or group of statements multiple times
1.While Loop:
"Repeats a statement or group of statements while a given condition is true.
It tests the condition before executing the loop body. "
2.For Loop:
"Execute a sequence of statements multiple times and
abbreviates the code that manages the loop variable. "
3.Do-While Loop:
"Like a while statement, except that it tests the condition at the end of the loop body. "
 */
public class Example4 {
    public static void main(String[] args) {
        //Using while Loop
        int y = 10;
        while( y <= 20 ) {
            System.out.print("value of y : " + y);
            y++;
            System.out.print("\n");
        }
        //reverse while loop
        int val = 5;
        while(val>=0){
            System.out.println(val);
            val--;
        }
        //Using for Loop
        for(int x = 10; x <= 20; x++) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
        //reverse for loop
        for(int j = 5;j>=0;j--){
            System.out.println(j);
        }
        //Using do-while Loop
        int z = 10;
        do{
            System.out.print("value of z : " + z );
            z++;
            System.out.print("\n");
        }while( z <= 20 );
        
        //loop control statements
        //break  -  it is used to break the flow of execution of loop or program
        //continue - it is used to skip the execution of program
        
        int num = 4;
        for(int i = 1;i<=4;i++){
            if(i==2)break;
            if(i==3)continue;
            System.out.println(i);
        }
    }
}
