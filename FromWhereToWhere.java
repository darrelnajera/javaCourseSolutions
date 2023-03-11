
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input asking from what integer to which one
        System.out.println("Where to?");
        int to = scanner.nextInt();
         System.out.println("Where from?");
        int from = scanner.nextInt();
        
        //for loop prints all the numbers from input from all the way to less than or equal to int to
        for(int i = from; i <= to; i++ ) {
            System.out.println(i);
        
    }

      
    }
}
