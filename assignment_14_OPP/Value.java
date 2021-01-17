package assignment_14_OPP;

public class Value {

	
	private int val;
	public static void main(String[] args) {
		Value  val=new Value ();
        System.out.println(val.getVal());
        val.setVal(8);
        System.out.println(val.getVal());
	}
	
	public Value (int val) {
		this.val=val;
	}
	public Value () {
	}
	
	public void setVal(int val) {
		this.val=val;
		wasModified();
		getVal();
	}
	
	public boolean wasModified() {
		return true;
	}
	
	public int getVal() {
		return val;
	}
	public int getVal(int val) {
		return val;
	}
	
	
}
