import java.util.*;
public class Program4{
public static boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number");
n=sc.nextInt();
if(isEven(n))
{
System.out.print("even");      
}
else
{
System.out.print("odd");
}
}
}



