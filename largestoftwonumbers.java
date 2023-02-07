import java.util.Scanner;
public class LargestOfTwoNumbers {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Input the First Number:");
		int n1 = s1.nextInt();
		System.out.print("Input the Second Number:");
		int n2 = s1.nextInt();
		
		if (n1==n2)
		{
			System.out.print("Both are equal");
		}
		
		if (n1>n2)
		{
			System.out.print(n1 + " " + "is the greatest number");
		}
		
		if (n2>n1) {
			System.out.print(n2 +" " +  "is the greatest number");
		}
		
	}
	
	

}
