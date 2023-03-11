
import java.util.Scanner;

//write program that ;rints numbers to 100
public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        //for loop prints all i's until the number is less than or qual to 100
        for(int i = input; i <= 100; i++){
            System.out.println(i);
        }

    }
}
