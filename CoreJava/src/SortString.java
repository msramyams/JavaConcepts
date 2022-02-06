import java.util.Scanner;
import java.util.Arrays;
public class SortString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to sort: ");
		String str=sc.nextLine();
		char charArray[]=str.toCharArray();
		Arrays.sort(charArray);
		System.out.println("After sorting: "+new String(charArray));
		

	}

}
