
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //call method
        word();

    }
    public static String word() {
        //bring scanner down to be able to use nextLine and return input
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        return word;
    }

}
