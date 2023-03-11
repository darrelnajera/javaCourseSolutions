

public class FromOneToParameter {

    public static void main(String[] args) {
        //call method below
        printUntilNumber(8);

    }
    public static void printUntilNumber(int limit) {
        
        //numbers being counted will start at 1
        int count = 1;
        
        //while the count is less than the limit the count increases and the
        //numbers will be shown after the method is called above
        while(count <= limit) {
            System.out.println(count);
            count++;
        }
        
    }

}
