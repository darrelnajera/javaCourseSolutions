
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //implement arraylist of strings
        ArrayList<String> list = new ArrayList<>();
        //loop goes on while input isnt blank
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            //print all inputs
            list.add(input);
        }
        System.out.println("Search for?");
        String name = scanner.nextLine();
        
        boolean searchFound = list.contains(name);
        if(searchFound) {
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }

    }
}
