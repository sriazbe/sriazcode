package day2.classroom.str;

public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";
		int no=0;
		

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

		char[] test1  = test.toCharArray();
		
		//System.out.println(new[]);
		/*for (char c : test1) {
			System.out.println(test1[]);
			c
		}*/
		for (int i=test1.length-1;i>=0;i--)
		{
			//System.out.println("Reverse of given Array");
			System.out.print(test1[i]);
		}
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		
		
		
		
		
		
		
		
		
	}

}
