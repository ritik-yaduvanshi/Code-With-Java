/*
 Datatypes int java
 1.Primitive Data Types
 byte , short , int , long , float , double , char , boolean
  by default value is 0 or 0.0 for numbers and for boolean false
 2. Non Primitive Data Types
 String , Object type
 */
public class Example2 {
    public static void main(String[] args) {
        //variable declaration
        byte num = 10;
        short num2 = 200;
        int num3 = 32000;
        long num4 = 98430483956L;

        float nums = 3.1423f;
        double numss = 4494.944;

        boolean response = true;

        char ch = 'A';

        String word = "This is a String";

        /*Operators in java

        Arithmetic Operators in Java
        1.Addition = '+'
        2.Subtraction = '-'
        3.Multiplication = '*'
        4.Division = '/'
        5.Modulo = '%'
        6.increment = '++'
        7.decrement = '--' */
         int number = 10;
         int number2 = 20;

         int sum = number + number2;
         int sub = number - number2;
         int multi = number * number2;
         int div = number2 / number;
         int mod = number2 % number;
         int postIncrement = number++;
         int preIncrement = ++number;
         int postDecrement = number--;
         int preDecrement = --number;

         /*
            Bitwise operator works on bits and performs
            bit-by-bit operation.
            1.& (bitwise and)
            2.| (bitwise or)
            3.^ (bitwise XOR)
            4.~ (bitwise compliment)
            5.<< (left shift)
            6.>> (right shift)
            7.>>> (zero fill right shift)
        */
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b; /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );
        c = a | b; /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );
        c = a ^ b; /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );
        c = ~a; /*-61 = 1100 0011 */
        System.out.println("~a = " + c );
        c = a << 2; /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );
        c = a >> 2; /* 15 = 1111 */
        System.out.println("a >> 2 = " + c );
        c = a >>> 2; /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );

        /*
        Assignment Operators
            1. =
            Simple assignment operator. Assigns values from right side operands to left side operand.
            2. +=
            Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.
            3. -=
            Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.
            4. *=
            Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.
            5. /=
            Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.
            6. %=
            Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.
            7. <<=
            Left shift AND assignment operator.
            8. >>=
            Right shift AND assignment operator
            9. &=
            Bitwise AND assignment operator.
            10. ^=
            bitwise exclusive OR and assignment operator.
            11. |=
            bitwise inclusive OR and assignment operator.
             */

        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= a = " + c );
        c &= a ;
        System.out.println("c &= 2 = " + c );
        c ^= a ;
        System.out.println("c ^= a = " + c );
        c |= a ;
        System.out.println("c |= a = " + c );

        /*
        Logical Operators in Java
        1. && (Logical and)
        "If both the operands are non-zero, then the condition becomes true."
        2. || (Logical or)
        "If any of the two operands are non-zero, then the condition becomes true. "
        3. ! (Logical not)
        "Use to reverses the logical state of its operand.
        If a condition is true then Logical NOT operator will make false."
         */
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));

        /*
           Relational Operators is used for find a relation between two or more
            arguments
            1.equal to '=='
            2.Not equal to '!='
            3.Greater then and Greater then equal to '>' '>='
            4.Less then and less then equal to '<' '<='
        */

        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a));
        
    }
}

