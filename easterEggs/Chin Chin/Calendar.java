import java.util.Scanner;
public class Calendar{

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the month of the year: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (month == 1){
            System.out.println("January has 31 days");
        }
        if (month ==2 && year % 4 == 0){
            System.out.println("February has 29 days");
        }
        if (month ==2 && year % 4 != 0){
            System.out.println("February has 28 days");
        }
        if (month == 3){
            System.out.println("March has 31 days");
        }
        if (month == 4){
            System.out.println("April has 31 days");
        }
        if (month == 5){
            System.out.println("May has 31 days");
        }
        if (month == 6){
            System.out.println("June has 31 days");
        }
        if (month == 7){
            System.out.println("July has 31 days");
        }
        if (month == 8){
            System.out.println("August has 31 days");
        }
        if (month == 9){
            System.out.println("September has 31 days");
        }
        if (month == 10){
            System.out.println("October has 31 days");
        }
        if (month == 11){
            System.out.println("Norvember has 31 days");}

       if (month == 12){
            System.out.println("December has 31 days");


        }
    }

}
