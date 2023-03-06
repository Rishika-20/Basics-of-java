package com.knoldus.logicaloperators;

//A program to perform logical operators using boolean variables. 
public class LogicalOperations {

	public static void main(String[] args)
	{

		boolean isCold = true;
	    boolean isRainy = false;
	    
	    if(isCold == true && isRainy == true)
	    {
	    	System.out.println("Bring a jacket and an umbrella.");
	    }
	    else if(isCold == true)
	    {
	    	System.out.println("Bring a jacket");
	    }
	    else if(isRainy == true) 
	    {
	    	System.out.println("Bring an umbrella");
	    }
	}

}


