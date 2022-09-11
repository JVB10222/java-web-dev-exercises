package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you travelled? ");
        int miles = input.nextInt();
        System.out.println("How many gallons have been consumed? ");
        double gallons = input.nextDouble();

        double mpg = miles/gallons;
        System.out.println("This car gets " + mpg + "mpg");
    }
}
