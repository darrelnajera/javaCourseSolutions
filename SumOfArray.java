
public class SumOfArray {

    public static void main(String[] args) {
        //call the method below here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        //store int for sum
        int sum = 0;
        //for loop iterates through the length of array
        for(int i = 0; i < array.length; i++) {
            //sum equals all indices in array added together
            sum = sum + array[i];
        
    }
        return sum;
    }
}
