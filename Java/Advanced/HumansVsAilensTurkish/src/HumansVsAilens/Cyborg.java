package HumansVsAilens;

public class Cyborg extends Alien {
	public int LaserPower;
	public int getLaserPower() {
		return LaserPower;
	}


	public void setLaserPower(int laserPower) {
		LaserPower = laserPower;
	}


	public Cyborg(int protectAlien,int laserPower) {
		ProtectAlien=protectAlien;
		LaserPower=laserPower;
	}
	
	
	public int GucHesapla(Cyborg cyborg1) {
		int top=0;
		top=cyborg1.getProtect()*cyborg1.getLaserPower();
		
		return top;
	}


}
