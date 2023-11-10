package HumansVsAilens;
import java.util.Random;
public class Main {

	
	
	public static void main(String[] args) {
		Random r=new Random();
		Farmer farmer1 = new Farmer(r.nextInt(10),r.nextInt(10));
		Soldier soldier1 = new Soldier(r.nextInt(10), r.nextInt(10));
		Miner miner1 = new Miner(r.nextInt(10), r.nextInt(10));
		Cyborg cyborg1= new Cyborg(r.nextInt(10), r.nextInt(10));
		System.out.println(farmer1.ProtectHuman+" "+farmer1.ProductNumber+" "+soldier1.ProtectHuman+" "+soldier1.AttackPower);
		System.out.println(miner1.ProtectAlien+" "+miner1.ProductNumberAlien+" "+cyborg1.ProtectAlien+" "+cyborg1.LaserPower);
    
		
		
	}

}
