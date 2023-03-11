
import java.util.Scanner;

//write program that counts numbers until number inputted
public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input
        int input = scanner.nextInt();
        //for loop prints out numbers until number inputted
        for(int i = 0; i <= input; i++) {
            System.out.println(i);
        }
        
        

    }
}
