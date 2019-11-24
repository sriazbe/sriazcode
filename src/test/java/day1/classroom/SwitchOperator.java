package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String args) {
		int i = 3;
		int n = 4;
		String oper;
		oper= "divide";
		switch (oper) 
		{
		
			case "add":
			System.out.println("sum of 2 numbers"+(i+n));
		    break;
		    
			case "sub":
			System.out.println("subtract of 2 numbers"+(i-n));
		    break;
			case "multiply":
			System.out.println("multiplication of 2 number"+(i*n));
		    break;
			case "divide":
			System.out.println("division of 2 numbers"+(i/n));
		    break;
		    default:
			System.out.println("there's no specified operator");
		    break;
		
		}	
	}
}
		
		// Declare 2 integer numbers
		

		// Declare a String variable with input as operations (Tip:
		

		// Initiate switch case for operations
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
