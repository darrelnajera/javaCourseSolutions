
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //store int sum for later and usr input
        int sum = 0;
        System.out.println("Last number?");
        int last = scanner.nextInt();
        
        //for loop keeps track of all the numbers between 0 and less than or equal to int last
        for(int i = 0; i <= last; i++) {
            sum += i;
        // print out sum
        }
        System.out.println("The sum is " + sum);
        

    }
}
