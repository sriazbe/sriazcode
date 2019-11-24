package day1.classroom;

public class Mobile {
	/*public String makeCall(String Name) {
		System.out.println("Calling friend");
		return Name;

	}*/
	public int phoneCall(int mobileno) {
		System.out.println("9890580979");
		return mobileno;
	}

	public String sendSMS(String Content) {
		System.out.println("Hi, How are you");

		return Content;

	}

	public boolean shutDown() {
		System.out.println();
		return true;
	}

public static void main(String[] args) {
	Mobile info = new Mobile();
	int person = info.phoneCall(908009048);
	System.out.println(person);
	String message = info.sendSMS("Hi");
	System.out.println(message);
	boolean dispos = info.shutDown();
	System.out.println(dispos);
}
}
	
	
	
			
	
