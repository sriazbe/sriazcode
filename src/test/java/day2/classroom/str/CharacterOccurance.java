package day2.classroom.str;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Python";

		// Here is what the count you need to find
		char ch = 'z';
		int totalCount = 0;
		char[] outpt = test.toCharArray();
		for (char c : outpt) {
			if (c == ch) {
				totalCount++;
				
			}
		} 
		System.out.println("No of occurence of given character("+ch+"):"+totalCount);
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		*/

		
		
		
		
		
		
		
		
		
		// Print the count here
		//System.out.println("Total count of character("+ch+"): " + totalCount);
		
	}

}
