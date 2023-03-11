
import java.util.Scanner;

public class AbsoluteValue {
    
    //Write a program that prints that absolute value of a number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input of integer
        int input = Integer.valueOf(scanner.nextLine());
        //if input is less than zero, multiply it by -1
        if(input < 0){
            System.out.println(input * -1);
        //if it is not less than zero simply print out input
        } else {
            System.out.println(input);
        }

    }
}
