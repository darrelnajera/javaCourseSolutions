
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //arraylist called numbers with integers created
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //while input doesnt equal 0 the loop goes on forever
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            //keep track of all inputs
            numbers.add(number);
        }
        //add second and third input
        System.out.println(numbers.get(1) + numbers.get(2));
    }
}
