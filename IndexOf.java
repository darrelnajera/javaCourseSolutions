
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        //loop goes on until -1 is inputted
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            //keep track of all inputs
            list.add(input);
        }
        //user input
        System.out.println("Search for?");
        int search = scanner.nextInt();
        // foor loop iterates through list size
        for(int i = 0; i < list.size(); i++){
            //if search matches .get(i) print out search is at index i
            if(search == list.get(i)){
            System.out.println(search + " is at index " + i);
                    
        }
            
        }

      

        
    }
}
