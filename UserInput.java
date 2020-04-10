import java.util.*;

public class UserInput {

public static void main (String[] xxx) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name: ");
String name = sc.nextLine();
System.out.println("Enter your birth date: ");
String birthdate = sc.nextLine();
System.out.println("Enter where you live: ");
String livelocation = sc.nextLine();
System.out.println("Your name is: " + name + "\n" + "Your birth date is: " + birthdate + "\n" + "You live in: " + livelocation);


}

}

