public class Digist {
    public static void main (String[] args){
        int num = 898;
        int ones = num % 10;
        int tens = (num % 100 - ones)/ 10;
        int hundreds = (num % 1000 - tens - ones)/ 100;
        System.out.println("The hundreds place is " + hundreds); 
        System.out.println("The tens place is " + tens);
        System.out.println("The ones place is " + ones);

    }
}
