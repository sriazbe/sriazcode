package day1.classroom;

public class Mobile {
	public String makeCall(String Name) {
		System.out.println("Calling SAi");
		return Name;

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
	info.makeCall(Name)Call("Sai");
	info.sendSMS("Hi ");
	boolean shutDown = info.shutDown();
	
	
			
	
}
}
