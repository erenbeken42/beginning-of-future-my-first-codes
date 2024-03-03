package HumansVsAilens;

public class Miner extends Alien {
	public int ProductNumberAlien;
	
	public int getProductNumberAlien() {
		return ProductNumberAlien;
	}

	public void setProductNumberAlien(int productNumberAlien) {
		ProductNumberAlien = productNumberAlien;
	}

	public Miner(int protectAlien, int productNumberAlien) {
		ProtectAlien= protectAlien;
		ProductNumberAlien= productNumberAlien;
	
	}
	
	public int GucHesapla(Miner miner1) {
		return miner1.getProductNumberAlien();
		
	}
	

}
