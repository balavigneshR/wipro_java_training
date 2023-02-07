import java.io.*;
import java.util.*;
public class UserMainCode
{
public static int countEvens(int input1, int input2, int input3, int input4, int input5){
int count=0;
if (input1%2==0)
{
count++;
}
if (input2%2==0)
{
count++;
}
if (input3%2==0)
{
count++;
}
if (input4%2==0)
{
count++;
}
if (input5%2==0)
{
count++;
}

return count;
}
public static void main(String args[])
{
int n1,n2,n3,n4,n5,ev_count;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 numbers: ");
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n4=sc.nextInt();
n5=sc.nextInt();
ev_count=countEvens(n1,n2,n3,n4,n5);
System.out.println(ev_count);
}
}
