
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //store int listSize to keep track of the list size
        int listSize;
        
        //while the input doesnt equal an empty space, for loop goes on
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            //keep track of all inputs
            list.add(input);
        }
        //print out list size
        listSize = list.size();
        System.out.println(listSize);

    }
}
