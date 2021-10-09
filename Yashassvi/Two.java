import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        System.out.println("Please enter a character.");
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        if (a == 'a' || a == 'e' || a== 'i' || a == 'o' || a == 'u'){
            System.out.println("Entered character is a vowel.");
        }
        else {
            System.out.println("Entered character is a consonant.");
        }
    }
}