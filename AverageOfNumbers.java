
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //store sum and count and input integers for later
        int input, sum = 0, count = 0;
        
        //loop goes on as long as 0 is inputted
        while(true){
            System.out.println("Give a number: ");
            input = scanner.nextInt();
            
            if(input == 0){
                break;
            }
            //if input doesnt equal 0 count increases and int sum equals total of all numbers
            if(input != 0){
                count ++;
                sum += input;
            }
            
        
       
 
            //use 1.0 to print out the average in order to avoid error
        }
        System.out.println("Average of the numbers: " + 1.0 * sum / count);
    

    }
}
