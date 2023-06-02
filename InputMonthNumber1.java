import java.util.Scanner;
class InputMonthNumber1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int mn;
mn=scob.nextInt();
if(mn==0){System.out.println("JANUARY");}
else if(mn==1){System.out.println("FEBRAUARY");}
else if(mn==2){System.out.println("MARCH");}
else if(mn==3){System.out.println("APRIL");}
else if(mn==4){System.out.println("MAY");}
else if(mn==5){System.out.println("JUNE");}
else if(mn==6){System.out.println("JULY");}
else if(mn==7){System.out.println("AUGUST");}
else if(mn==8){System.out.println("SEPTEMBAR");}
else if(mn==9){System.out.println("OCTOBAR");}
else if(mn==10){System.out.println("NOVEMBER");}
else if(mn==11){System.out.println("DECEMBAR");}
else{System.out.println("INVALID");}
}
}