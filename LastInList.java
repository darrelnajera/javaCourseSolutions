
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //store int for list size and implement arraylist
        int listSize;
        ArrayList<String> list = new ArrayList<>();
        //while input doesnt equal empty space loop goes on forever
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            //keep track of inputs
            list.add(input);
        }
        //subtract 1 from list size to get the last input
        System.out.println(list.get(list.size()-1));
                
    }
}
