
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user input
        System.out.println("How many times?");
        int times = scanner.nextInt();
        
        //for loop calls printText method until less than or equakl to times
        for(int i = 0; i <= times; i++) {
            printText();
        }
        
       
    }
    
   //method containg message we will call above
    public static void printText() {
        // write some code here
         System.out.println("In a hole in the ground there lived a method");
    }
}
