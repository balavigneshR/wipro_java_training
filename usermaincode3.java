import java.io.*;
import java.util.*;
public class UserMainCode3
{
public static int isMultiple(int input1,int input2)
{
if(input1==0 || input2==0)
{
return 3;
}
else if(input2>=0)
{
if(input1%input2==0)
{
return 2;
}
else
{
return 1;
}
}
return 0;
}
public static void main(String args[])
{
int no1,no2,result;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number: ");
no1=sc.nextInt();
System.out.println("Enter second number: ");
no2=sc.nextInt();
result=isMultiple(no1,no2);
System.out.println(result);
}
} 
