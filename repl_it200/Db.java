package repl_it200;

public class Db {
	
	private String data;
    private int yint;
    
    public void insertData(String data ,int yint) {
    	this.data=data;
    	this.yint=yint;
    	
    }
    
	public String getData() {
	
		insertData(data, yint);
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getYint() {
		return yint;
	}
	public void setYint(int yint) {
		this.yint = yint;
	}
    
    

}
