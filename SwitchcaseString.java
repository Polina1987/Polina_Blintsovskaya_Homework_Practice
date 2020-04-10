import java.util.*;

public class SwitchcaseString {

public static void main (String[] xxx) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a day of the week to see if it is weekday or a weekend: ");
String day = sc.nextLine();
switch (day.toLowerCase()) {
case "monday":
case "tuesday":
case "wednesday":
case "thursday":
case "friday":
System.out.println("This is a week day");
break;
case "saturday":
case "sunday":
System.out.println("This is a weekend");
break;
default:
System.out.println("This is not a day of the week.");

}

}

}

