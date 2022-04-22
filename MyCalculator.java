package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {

	Calculator cal = new Calculator ();
	int sum = cal.addNumbers(23, 10, 20);
	System.out.println(sum);
	
	int sub = cal.subNumbers(50, 30, 30);
	System.out.println(sub);
	
	double mul = cal.mulNumbers(234567.1323456789, 456.2343456789);
	System.out.println(mul);
	
	float div = cal.dividenumbers(23.45F, 12.345F);
	System.out.println(div);
	
			
	
}
}