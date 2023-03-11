
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //arraylist in integers inplemented
        ArrayList<Integer> list = new ArrayList<>();
        
        //loop goes on forever while input isnt -1
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            //keep track of inputs
            list.add(input);
        }
        //store variable for the greatest in the list
        int greatest = list.get(0);
        //for loop iterates through the whole list size
        for(int i = 0; i <= list.size(); i++){
            //store integer for all the numbers in the loop
            int number = list.get(i);
            //if any of the numbers are greater than any other of the numbers
            //it is the greatest in the list size
            if(greatest < number) {
                greatest = number;
            }
        }
        //print out the greatest
        System.out.println("The greatest number: " + greatest);

        // implement finding the greatest number in the list here
    }
}
