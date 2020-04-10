import java.util.*;

public class Array {

public static void main (String[] xxx) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of your array: ");
int arraysize = sc.nextInt();
String [] hobbies = new String[arraysize];
System.out.println("Enter your hobbies: ");
for (int i = 0; i < arraysize; i++) {
String enterhobbies = sc.next();
hobbies[i] = enterhobbies;
}
System.out.println("Your hobbies are: " + Arrays.toString(hobbies));
System.out.println("First entry: " + hobbies[0]);
System.out.println("Last entry: " + hobbies[hobbies.length-1]);

System.out.println("Do you want your array displayed again?");
String display = sc.next();
if (display.equals("yes") || display.equals("Yes")) {
for (String i : hobbies) {System.out.println(i); } }
else System.out.println("You don't want the string displayed again.");


}

}

