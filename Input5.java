import java.util.Scanner;
class Input5{
public static int div(int a,int b)
{
int c=a/b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("enter a number:");
int num1;
num1=scob.nextInt();
System.out.print("enter a number:");
int num2;
num2=scob.nextInt();
System.out.println(num1+"/"+num2+"="+div(num1,num2));
}
}