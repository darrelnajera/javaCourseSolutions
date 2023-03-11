
import java.util.Scanner;

public class OnlyPositives {
    
    //write a program that prins your input squared

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            //user input
            System.out.println("Give a number:");
            int inpit = scanner.nextInt();
            // if number is negative continue the loop asking for a new number
            if(inpit < 0){
                System.out.println("Unsuitable number");
                continue;
            }
            //if number is zero stop the loop
            if(inpit == 0){
                break;
            }
            print out positive number times itself to get input squared
            System.out.println(inpit * inpit);
        }
            
    }

}

