
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        
        //store integer for index
        int index = 0;
        
        //use while loop to print out all indices at first
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        //user input to swap two indices
        System.out.println("");
        System.out.println("Give two indices to swap:");
        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();
        
        //store int for the index getting swapped
        int gettingSwapped = array[indexOne];
        
        //make them equal to eachother and then assign gettingSwapped int to indexTwo
        array[indexOne] = array[indexTwo];
        array[indexTwo] = gettingSwapped;

        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("");
        index = 0;
        
        //use while loop to print out new loop with swapped indices
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
