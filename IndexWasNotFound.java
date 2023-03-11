

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        //user input
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        //iterate through the length of the array
        for(int i = 0; i < array.length; i++) {
            //if input equals one of numbers in the array print out message
            if(searching == array[i]){
               System.out.println(searching + " was found at index " + i + ".");
            } else {
                System.out.println(searching + " was not found.");
            
            }

       
    }

}
