
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //arraylist implemented
        ArrayList<Integer> numbers = new ArrayList<>();
        //while input isnt negative 1 loop goes on forever
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            
            if (luku == -1) {
                break;
            }
            //keep track of all numbers
            numbers.add(luku);
        }
        //for loop prints out all numbers in the index
        for (Integer i : numbers){
            System.out.println(i);
        }

    }
}
