package javacrashcourse;

public class calculator
{

	public static void main(String[] args) 
	{
		int a=40;
		int b=20;
		char var='/';
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
		default : System.out.println("invalid input);
		          break;
	    }

	}

}
