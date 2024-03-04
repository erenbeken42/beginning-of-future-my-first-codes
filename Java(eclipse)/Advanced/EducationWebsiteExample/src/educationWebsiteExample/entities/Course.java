package educationWebsiteExample.entities;

public class Course {
	private int id;
	private String name;
	private int unitPrice;
	public Course (int id,String name, int unitPrice) {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
