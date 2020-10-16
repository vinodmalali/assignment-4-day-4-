\\day 4 assignment
1) 
  import java.utill.Scanner;
  class Avg
  {
    String name;
    int age ;
    int pwr;
    String wpn;
    String plt;
    Scanner scan = new Scanner(System.in);
  
 void getDetails()
 {
   System.out.println("enter the name :");
   name=scan.nextLine();
   System.out.println("enter the age ");
   age=scan.nextInt();
   System.out.println("enter power");
   pwr=scan.nextInt();
   System.out.println("enter the weapon:");
   wpn=scan.nextLine();
   System.out.println("enter the planet:);
   planet=scan.nextLine();
 }
 void displayDetails()
 {
    System.out.println("name:"+name+"age:"pwr+"wpn:"plt)
 }public class main
  {
    public static void main(String[] args)
    {
      avg a[]=new Avg[5];
      for(int i=1;i<=5;i++)
      {
        a[i].getDetails();
       }
      for(int j=1;j<=5;j++)
      {
        a[j].displayDetails();
      }
    }
  }
}


2)  
  class array{
           public static void main(String args[]){
    		int a[]={10,20,23,24,25);
		System.out.println("odd number are :\n");
		for(int i=0;i<5;i++)
		{
		    if(a[i]%2 !=0)
		     { 
			System.out.println(a[i]+"\n");
		     }
		}
}
}


3)
  import java.util.*;
 class array{
           public static void main(String args[]){
		int a[]=new int[5];
		int b=0;
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
		    a[i]=sc.nextInt();
		}
		for (int i=0;i<5;i++)
		{
		    b=b+a[i];
		}
		System.out.println(b+"\n");
}
}
  
   
   