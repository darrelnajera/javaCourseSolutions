
import java.util.Scanner;

public class CarryOn {

    //write program that asks user if they want to keep caarying on
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while(true){
            
            //user input
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            
            //if input equals no, stop the loop
            if(input.equals("no")){
                break;
            //if it doesn't equal no, keep the loop going
            } else {
                continue;
            }
        }
    }
}
