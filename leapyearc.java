package javacrashcourse;

public class leapyearc {

	public static void main(String[] args) 
	{
	   int year=1992;
	   if(year%400==0)
	   {
		   System.out.println("leap year");
	   }
	   
	   else if(year%100==0)
		   System.out.println("leap year");
	   else if(year%4==0)
		   System.out.println("leap year");
	   else
		   System.out.println("not a leap year);
	}

}
