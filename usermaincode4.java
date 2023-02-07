import java.io.*;
import java.util.*;

public class UserMainCode4 {
    public static int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6) {
        int count = 0;
        if (input6.equalsIgnoreCase("odd")) {
            if (input1 % 2 != 0) {
                count++;
            }
            if (input2 % 2 != 0) {
                count++;
            }
            if (input3 % 2 != 0) {
                count++;
            }
            if (input4 % 2 != 0) {
                count++;
            }
            if (input5 % 2 != 0) {
                count++;
            }
        } else if (input6.equalsIgnoreCase("even")) {
            if (input1 % 2 == 0) {
                count++;
            }
            if (input2 % 2 == 0) {
                count++;
            }
            if (input3 % 2 == 0) {
                count++;
            }
            if (input4 % 2 == 0) {
                count++;
            }
            if (input5 % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int n1, n2, n3, n4, n5, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: with option even or odd: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        String opt = sc.next();
        x = countEvensOdds(n1, n2, n3, n4, n5, opt);
        System.out.println(x);
    }
}
