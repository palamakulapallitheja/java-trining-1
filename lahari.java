class B
{
public static void main(){
System.out.println("main method is without argument called");
}
public static void main(String args[])
{
System.out.println("lahari is typing");
main();
main(20);
}
public static void main(int x)
{
System.out.println("main method with argument called"+x*2);
}
}
