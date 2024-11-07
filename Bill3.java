// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args, int price) {
		//Takes the inputs from the user.
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double bill = price / 3;
		//rounds up the double
		bill = Math.ceil(bill);
		System.out.println("Dear " + name1 + ", " + name2 + ", and" + name3 + "pay " + bill + " Shekels each.");
	   
	}
}
