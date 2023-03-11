
import java.util.Scanner;

//write a program that prints out how many numbers you inputted
public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //store int for later to keep track of number of numbers
        int input = 0, count = 0;
        
        //every time a number is inputted the count goes up
        while(true){
            count++;
            System.out.println("Give a number:");
            input = scanner.nextInt();
            //stop the loop if the number is 0
            if(input ==0){
                break;
            }
        }
        //to avoid counting the 0, you inputted print out int count - 1.
        System.out.println("Number of numbers: " + (count - 1));

    }
}
