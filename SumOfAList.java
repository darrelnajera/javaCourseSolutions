
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        //loop goes on until -1 is inputted
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            //add inputs to the list
            list.add(input);
        }
        //for loop adds up ivery input in the list
        for(int i: list){
            sum += i;
        }
                
        //print out sum
        System.out.println("Sum: " + sum);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
