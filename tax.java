package javacrashcourse;

public class tax {

	public static void main(String[] args) 
	{
      double salary=35000.00;
      double tax;
      if((salary>=0.00)&&(salary<=14999.99))
    	  tax=0.00+((15/100)*salary);
		System.out.println("$"+tax);
      else if((salary>=15000.00)&&(salary<=29999.99))
    	   tax=2250.00+((18/100)*salary);
		System.out.println("$"+tax);
      else if((salary>=30000.00)&&(salary<=49999.99))
    	  tax=5400.00+((22/100)*salary);
		System.out.println("$"+tax);
      else if((salary>=50000.00)&&(salary<=79999.99))
    	  tax=11000.00+((27/100)*salary);
		System.out.println("$"+tax);
      else if((salary>=80000.00)&&(salary<=150000.00))
    	  tax=21600.00+((33/100)*salary);
		System.out.println("$"+tax);
       else
       {
	System.out.println(-1);
       }
      

    	  
    	  

	}

}
