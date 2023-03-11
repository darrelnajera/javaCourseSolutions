
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //call method
        divisiblebyThreeInRange(1,19);

    }
    
    //parameters beginning and end will b e used in for loop
    public static void divisiblebyThreeInRange(int beginning, int end) {
        //loop from start to finish
        //keep count of amount of number divisible by 3 in for loop
        int count = 0;
        
        //for any numbers from start to finish in the for loop are divisible
        //by three, the count goes up
        for(int i = beginning; i < end; i++){
            if(i % 3 == 0) {
                count++;
                System.out.println(i);
                
            }
        }
    }

}
