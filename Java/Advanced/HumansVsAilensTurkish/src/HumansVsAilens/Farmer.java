package HumansVsAilens;

public class Farmer extends Human{
	public int ProductNumber;
	public Farmer(int protect,int productNumber) {
		ProtectHuman=protect;
		ProductNumber= productNumber;
	}
	public int getProductNumber() {
		return ProductNumber;
	}
	public void setProductNumber(int productNumber) {
		ProductNumber = productNumber;
	}
	public int GucHesapla(Farmer farmer1) {
		return farmer1.getProductNumber();
		
		
	}

}

