import java.util.*;

public class ElseIf {

public static void main (String[] xxx) {
Scanner sc = new Scanner(System.in);
System.out.println("Did you like the tv show Tiger King?");
String like = sc.nextLine();
if (like.equals("yes") || like.equals("Yes")) { System.out.println("You liked Tiger King"); }
else if (like.equals("no") || like.equals("No")) { System.out.println("You did not like Tiger King"); }
else { System.out.println("This is not a yes/no opinion"); }
}

}

