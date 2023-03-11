
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //store int sum for later and usr input
        int sum = 0;
        
        System.out.println("First number?");
        int first = scanner.nextInt();

        System.out.println("Last number?");
        int last = scanner.nextInt();
        
        //for loop keeps track of all the numbers between first number and less than or equal to int last
        for(int i = first; i <= last; i++) {
            sum += i;
        // print out sum
        }
        System.out.println("The sum is " + sum);
        

    }
}
