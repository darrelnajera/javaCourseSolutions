
public class StarSign {

    public static void main(String[] args) {

        
        
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes to separate them
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for(int i = 0; i < number; i++) {
            //print stars for how ever many is called via method above
            System.out.println("*");
        }
        //print this out to print the stars out on the same line
        System.out.println("");
    }
    //method to print square
    public static void printSquare(int size) {
        //for loop prints stars until size int
        //by printing out size you will basically create a size* size 2d array
        for(int i = 0; i < size; i++){
            
            //call printstars method to be able to print stars in output, not numbers
            printStars(size);
        }
    }
    //method to print rectangle
    public static void printRectangle(int width, int height) {
        
        //for loop will be implemented all the way through height
        for(int i = 0; i < height; i++){
            
            //call printstarsmethod and use width as a parameter to create 
            //width and height of a rectangle
            printStars(width);
            
        }
        
    }
    //method to print triangle
    public static void printTriangle(int size) {
        
        //for loop will print one star on top(i=1) and number of stars will 
        //increase by 1 on each following line until the number given when
        //method is called
        for(int i = 1; i < size; i++){
            
            //we print i since i will be increasing on each line by 1(i++)
            printStars(i);
        }
    }
}
