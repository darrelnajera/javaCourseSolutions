
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //while loop goes on until 9999 is inputted
        while(true){
            int input = scanner.nextInt();
            if (input == 9999){
                break;
            }
            //keep track of inputs
            list.add(input);
        }
        //store variable to get the smallest number in arraylist
        int smallest = list.get(0);
        int number = 0;
        //for loop iterates through list size
        for(int i = 0; i < list.size(); i++){
            //int number represents all numbers in loop
            number = list.get(i);
            
            //if itn smallest is less than any other of the numbers it is the 
            //smallest
            if (smallest < number){
                number = smallest;
               
                
            }
            
        }
        //print out smallest message
        System.out.println("Smallest number: " + smallest);
        //create new for loop to find the index of the smallest
        for(int i = 0; i < list.size(); i++){
            //if int smallest is found at certain index print out the index 
            if(smallest == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
       
       
            
    
        
    }
}    

