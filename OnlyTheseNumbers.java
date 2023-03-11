
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //implement arraylist of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //loop goes on forever while input isnt -1
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            //.add keeps track of all inputs
            numbers.add(number);
        }
        //user input
        System.out.println("From where?");
        int from = scanner.nextInt();
        System.out.println("To where?");
        int to = scanner.nextInt();
        
        //for loop gets all the numbers in the index from user input to and from
        for(int i = from; i <= to; i++){
            System.out.println(numbers.get(i));
        }

    }
}
