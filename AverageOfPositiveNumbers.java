
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input, sum = 0, count = 0;
        //Loop forever while this is true
        while(true){
            //user input
            input = scanner.nextInt();
            //if user input is 0 stop loop
            if(input == 0){
                break;
            }
            //if user input is more than 0, count increases the amount of poitives inputted
            //int sum = sum + all inputs added together
            if(input > 0){
                count++;
                sum += input;
            }
        }
        //if there are no positive numbers print out error message
        if(count == 0){
            System.out.println("Cannot calculate the average");
        }
        //We could use a double, but instead we can just multiplyh the average by 1.0.
        System.out.println(1.0 * sum / count);

    }
}
