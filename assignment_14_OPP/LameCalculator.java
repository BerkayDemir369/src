package assignment_14_OPP;

public class LameCalculator {
	
	
	public int plus(int a,int b) {
	
		int result=Math.addExact(a, b);
		return result;
	}
	
	public int minus(int a,int b) {
	
		int result=Math.subtractExact(a,b);
		return result;
	}
	
	public int multiply(int a,int b) {
		int result=Math.multiplyExact(a,b);
		return result;
		
	}
	
	public int divide(int a,int b) {
		
		int result=Math.floorDiv(a, b);
		return result;
		
		
	}
	
	public static void main(String[] args) {
		LameCalculator lc= new LameCalculator();
		
		System.out.println(lc.plus(1,1));
		
		System.out.println(lc.minus(1,1));
		
		System.out.println(lc.multiply(2,1));
		
		System.out.println(lc.divide(10, 2));
		
	
	}

}
