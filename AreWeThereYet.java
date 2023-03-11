
import java.util.Scanner;

//write a program that stops whn 4 is inputted
public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            //user input
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            //if input equals 4 break the loop
            if(input == 4) {
                break;
            }
        }

    }
}
