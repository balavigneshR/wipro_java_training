import java.util.*;
public class EvenOrOdd {
	
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 System.out.print("Input a number: ");
     int n = in.nextInt(); 
            if (n % 2 == 0) {
                System.out.println("The number is even"); 
               }
			else {
                System.out.println("The number is odd"); 
              }
     }
}
