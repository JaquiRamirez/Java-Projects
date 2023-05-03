/**
 * one
 */
import java.util.Scanner;
public class one {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Full Name? ");
        String name = keyboard.nextLine();
        
        System.out.print("Address? ");
        String address = keyboard.nextLine();
        
        System.out.print("Date of Birth? ");
        String dateOfBirth = keyboard.nextLine();
 
        System.out.print("Phone Number? ");
        String phone = keyboard.nextLine();
        System.out.println("------------------------------");
        System.out.println(name + " Information" + "\n\t" + "Address: " + address +  "\n\t" + "D.O.B: " + dateOfBirth + "\n\t" + "Phone Number: " + phone);

    }
}