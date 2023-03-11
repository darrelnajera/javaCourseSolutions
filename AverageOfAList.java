
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //store integer for sum and amount of inputs
        int sum = 0, amount = 0;
        while(true){
            int input = scanner.nextInt();
            //stop if input is -1
            if(input == -1){
                break;
            }
            //add inputs to list
            list.add(input);
        }
        // for loop to keep track of all inputs in the list
        for(int i: list){
            //amount increases by 1 and sum is all inputs added together
            sum += i;
            amount++;
        }
        //mulitply by 1.0 to get average
        System.out.println("Average: " + 1.0 * sum / amount);


        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
