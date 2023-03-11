
import java.util.Scanner;

public class NumberOfNegativeNumbers {
    
    //write a program that outputs the numbef of all the negative numbers you inputted

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //store amount of negative numbers for later
        int negNumbers = 0, input = 0;
        
       //do while loop keeps on repeating after 1st negative number is inputted
        do{
            System.out.println("Give a number:");
            input = scanner.nextInt();
            //negNumbers count increased everytime number less than zero is inputted
            if(input <= 0){
                negNumbers++;
            }
        // do/while loop keeps on going only when input doesn't equal 0
        }while(input != 0);
       
        //print out negNumbers - 1 to not include the 0 inputted
        System.out.println("Number of negative numbers: " + (negNumbers - 1));
        

    }
}
