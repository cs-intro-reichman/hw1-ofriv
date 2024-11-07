// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double interestRate = (Double.parseDouble(args[1])) / 100;
		int years = Integer.parseInt(args[2]);
		double futureValue =  currentValue * Math.pow((1 + interestRate), years);
		System.out.println(futureValue);
		System.out.println("After " + years + " years, $" + (int)currentValue + " saved at " + (interestRate * 100) + "% will yield $" + (int)futureValue);
	}
}