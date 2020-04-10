import java.util.*;

public class Modulo {

public static void main (String[] xxx) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to see its value as pennies, nickels, dimes, quarters, and dollars");
int num = sc.nextInt();
int nickels = num/5;
int nickelmod = num % 5;
int dimes = num/10;
int dimemod = num % 10;
int quarters = num/25;
int quartermod = num % 25;
int dollars = num/100;
int dollarmod = num % 100;

System.out.println("This number contains:\n" + num + " pennies\n" + nickels + " nickels, with a remainder of " + nickelmod + " pennies\n" + dimes + " dimes, with a remainder of " + dimemod + " pennies\n" + quarters + " quarters, with a remainder of " + quartermod + " pennies\n" + dollars + " dollars, with a remainder of " + dollarmod + " pennies.");


}

}

