package assignment_14_OPP;

public class GasTank {

	
	double amount=0;
	double capacity=0;
	
	public GasTank(double capacity) {
		this.capacity=capacity;
	}
	
	public void addGas(double amount) {
		
		this.amount += amount;
		if(amount>capacity) {
			this.amount=capacity;
		}
	}
	
	public void useGas(double amount) {
		this.amount -= amount;
		
		if(amount<0) {
			this.amount =0;
			
			
		}
	}
	
	public boolean isEmpty() {
		
		if(amount<0.1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(amount>0.1) {
			return true;
			
		}else {
			return false;
			
		}
	}
	
	public double getGasLevel() {
		
		return amount;
	}
	
	
	public double fillUp() {
		double difference= capacity-amount;
		
		return difference;
	}
}
