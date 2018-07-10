package com.demo;

public class WrongInput extends Exception {
public WrongInput()
{
	System.out.println("Wrong Inputs");
}
/*public WrongInput(String message)
{
	super(message);
}*/
void printMsg()
{
	System.out.println("Page number should be between 1-6");
	System.exit(0);
}
}
