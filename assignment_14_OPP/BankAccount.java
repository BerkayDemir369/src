package assignment_14_OPP;

public class BankAccount {
	
	
	

	class SavingAccount extends BankAccount {
		
		
		double interestRate;
		 
		public double getInterestRate() {
			
			return interestRate;
		}
		
		public SavingAccount(double interestRate) {
			
			this.interestRate=interestRate;
		}
		
	}
}
