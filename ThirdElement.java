
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //arraylist of strings called list inplemented
        ArrayList<String> list = new ArrayList<>();
        
        // input strings forever until a blank string is inputted
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            //keep track of all inputs in arraylist
            list.add(input);
        }
        //get the third input from arraylist
        System.out.println(list.get(2));
    }
}
