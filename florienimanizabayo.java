//Java program to read data of various types using Scanner class
import java.util.*;
  class employee
{
static String name ;
static String address;
static int salary;
static int gross_salary;
static int hours;
static void getdata()
{
Scanner Sc= new Scanner (System.in);
int opt;
System.out.println("select option : [1]monthly ,[2]hourly,[3]weekly");
opt=Sc.nextInt();
if(opt==1)
{
System.out.println("enter name");
name=Sc.next();
System.out.println("enter address");
address=Sc.next();
System.out.println("enter salary");
salary=Sc.nextInt();
salary=(gross_salary)-(((salary*30)/100)+((salary*3)/100)+((salary*5)/100));
 //salary equal to gross salary -Deduction +lampsam
 //Deduction must equel to tax equal 30% of salary and RSSB equal 3% of salary
 //Lampsam must equel to 5% of salary
System.out.println("your salary ="+salary);
}
else if(opt==2)
{
System.out.println("enter name");
name=Sc.next();
System.out.println("enter address");
address=Sc.next();
System.out.println("enter hourly rate");
salary=Sc.nextInt();
System.out.println("enter hours");
hours=Sc.nextInt();
salary=(((salary*hours)*30)/100)*(salary*hours);
//salary equal hourly rate * hours
System.out.println("your salary ="+salary);	
}
else if(opt==3)
{
System.out.println("enter name");
name=Sc.next();
System.out.println("enter address");
address=Sc.next();
System.out.println("enter salary");
salary=Sc.nextInt();
int salaray;
salary=salary;
//salary equal to salary your get mean no tox and no lampsam
System.out.println("your salary ="+salary);	
}	
else
{
System.out.println("you enering imvalid option");
}
}		
public static void main(String args[])
{
getdata();
}
}