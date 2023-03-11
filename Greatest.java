
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //store integer for greatest number
        int greatest = 0;
        
        //if either number is greater than eachother then they equal int greatest
        if(number1 > number2){
            number1 = greatest;
        } else {
            number2 = greatest;
            
        //if the 3rd number is greater than the greatest of the 1st two the third one
        //is the greatest
        }
        if(number3 > greatest) {
            greatest = number3;
        }
         //return
         return greatest;
        
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
