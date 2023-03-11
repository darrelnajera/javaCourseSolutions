
import java.util.Scanner;
//write a program that compares the values of two numbers
public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user input of integers
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        
        //if first number is greather than second print out greater than message
        if(inputOne > inputTwo){
            System.out.println(inputOne + " is greater than " + inputTwo + ".");
       
        //if second is bigger print out lesser than message
        } else if (inputTwo > inputOne){
            System.out.println(inputOne + " is smaller than " + inputTwo + ".");
        
        //if theyre equal print out equal message
        } else {
            System.out.println(inputOne + " is equal to " + inputTwo + ".");
        }
  

    }
}
