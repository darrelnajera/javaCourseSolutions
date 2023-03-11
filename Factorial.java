
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //store sum for later
        int sum = 0;
        //user input
        System.out.println("Give a number");
        int num = scanner.nextInt();
        
        //for loop keeps track of all numbers less than or equal to int num 
        //so we can multiply them all
        //sum equals all i's multiplied by eachother in for loop
        for(int i = 0; i <= num; i++) {
            sum = sum * i;
            System.out.println(sum);
            
        }
        //print out the factorial 
        System.out.println("Factorial: " + sum);
          

    }
}
