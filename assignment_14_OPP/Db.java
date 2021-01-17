package assignment_14_OPP;

public class Db {

	private String Data;
	private int Yint;
	
	
	public void insertData(String Data,int Yint) {
		this.Data=Data;
		this.Yint=Yint;
	}


	
	public String getData() {
		return Data;
	}



	public void setData(String data) {
		Data = data;
	}



	public int getYint() {
		return Yint;
	}



	public void setYint(int yint) {
		Yint = yint;
	}



	public static void main(String[] args) {
		Db db= new Db();
		db.insertData("aaa",123);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		db.setData("zzz");
		db.setYint(200);
		System.out.println(db.getData());
		System.out.println(db.getYint());
	}
	
	
}
