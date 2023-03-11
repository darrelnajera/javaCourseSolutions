
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        
        //store all integers we will use for later
        int input = 0,sum = 0, numbers = 0, average = 0, even = 0, odd = 0;
        
        System.out.println("Give numbers:");
        
        //while the input doesn't equal -1 the loop goes on forever
        while(input != -1){
            input = scanner.nextInt();
            
            // For every positive number, numbers increases by 1 and int sum from
            // earlier equals all the inputs added together
            if(input > 0) {
            sum += input;
            numbers++;
            }
            
            //if the number is divided by 3 = 0, then odd count increases by 1
            // else even count increases
            if(input % 3 == 0) {
                odd++;
            } else {
                even++;
            }
       }
        //print out all the integers we stored at the beginning
        System.out.println("Thx Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + 1.0 *(sum/numbers));
        System.out.println("Numbers " + numbers);
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
        
    }
}
