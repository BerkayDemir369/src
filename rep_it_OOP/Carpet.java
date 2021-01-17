package rep_it_OOP;

public class Carpet {

	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	 
	 //Add constructors below
	  
	  public Carpet() {
		  this.width=300;
		  this.length=300;
		  this.isPersian=false;
		  this.unitPrice=0;
		  this.totalPrice=200;
		  
		  
	  }
	public Carpet(double width, double length, double unitPrice, boolean isPersian) {
		super();
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;
		if(isPersian==true) {
			this.totalPrice= ((width+length)*unitPrice)+200;
		}else {
			this.totalPrice=((width+length)*unitPrice);
		}
	}
	  

}
