/**
 * one
 */
import java.util.Scanner;
public class one {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //--------------------------------Basic info program--------------------------
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

        //---------------------------Dimensions of a cuboid---------------------------------
        System.out.println("------------------------------");
        System.out.println("Finding the volume of a cuboid");
        
        //A float, incase the numbers are in decimals
        System.out.print("Enter length: ");
        float length = keyboard.nextFloat();
        
        System.out.print("Enter width: ");
        float width = keyboard.nextFloat();
        
        System.out.print("Enter height: ");
        float height = keyboard.nextFloat();
        
        float volume = length * width * height;
        System.out.println("Volume of the cuboid: " + volume);
        
         //---------------------------Calculator---------------------------------
         System.out.println("------------------------------");
        //Using Float for a better accuracy on decimals
        System.out.print("Enter a number: ");
          
        float num1 = keyboard.nextFloat();
        System.out.print("Enter another number: ");
        float num2 = keyboard.nextFloat();
          
        float add = num1 + num2;
        float substraction = num1 - num2;
        float multiplication = num1 * num2;
        float division = num1 / num2;
          
        System.out.println("The two numbers add up to: " + add);
        System.out.println("The two numbers subtract to: " + substraction);
        System.out.println("The two numbers multiply to: " + multiplication);
        System.out.println("The two numbers divide to: " + division);


    }
}