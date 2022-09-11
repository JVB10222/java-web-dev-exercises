package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length: ");
        double length = input.nextDouble();
        System.out.println("Please enter a width: ");
        double width = input.nextDouble();
        System.out.println("The area of this rectangle is " +(length * width) + "SqFt");
        input.close();
    }
}

