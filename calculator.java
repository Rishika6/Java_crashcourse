package javacrashcourse;

public class calculator
{

	public static void main(String[] args) 
	{
		int a=40;
		int b=20;
		char var='/';
		System.out.println("enter the operation");
		switch(var)
		{ 
		case '+': System.out.println(a+b);
		          break;
		case '-': System.out.println(a-b);
		          break;
		case '*': System.out.println(a*b);
		          break;
		case '/': System.out.println(a/b);
		          break;
	    }

	}

}
