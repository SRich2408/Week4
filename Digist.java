import java.util.Scanner;
public class Digist {
    public static void main (String[] args){
        int number;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 3 digit number:");
        number = input.nextInt();

        
        int ones = number % 10;
        int tens = (number % 100 - ones)/ 10;
        int hundreds = (number % 1000 - tens - ones)/ 100;
        System.out.println("The hundreds place is " + number + " is " + hundreds); 
        System.out.println("The tens place is " + number + " is " + tens);
        System.out.println("The ones place is " + number + " is 389" + ones);

    }
}
