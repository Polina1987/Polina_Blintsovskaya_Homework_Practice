import java.util.*;

public class Array2 {

public static void main (String[] xxx) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of your array: ");
int size = sc.nextInt();
int[] array = new int[size];
System.out.println("Enter number array: ");
for (int i = 0; i < size; i++) {
int nums = sc.nextInt();
array[i] = nums;
}

System.out.println("Your array in array format: " + Arrays.toString(array));

System.out.println("Your array entries: "); 
for (int s : array) {System.out.println(s); }


}

}

