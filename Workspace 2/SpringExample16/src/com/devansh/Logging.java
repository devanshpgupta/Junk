package com.devansh;

public class Logging {

	public void beforeAdvice()
	{
		System.out.println("Who Are You?????");
	}
	public void afterAdvice()
	{
		System.out.println("Let Me Guess!!!!!");
	}
	public void afterReturningAdvice(Object retVal)
	{
		System.out.println("Hmmmmm, you are "+retVal.toString());
	}
	

}
