package rep_it_OOP;

public class ParkingMeter {
	
	int timeLeft=0;
	int maxTime;
	
	public ParkingMeter(int maxTime) {
		
		this.maxTime=maxTime;
		
	}
	
	public boolean add(int add) {
		if(add==25 && timeLeft<maxTime) {
			
			this.timeLeft += 30;
			return true;
			
		}
		return false;
	}
	
	public void tick() {
		if(timeLeft>0) {
			timeLeft -= 1;
			
		}
	}
	
	public boolean isExpired() {
		
		if(timeLeft==0) {
			return true;
		}
		
		return false;
	}
}
