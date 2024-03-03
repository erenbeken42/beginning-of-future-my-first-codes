package HumansVsAilens;
import java.util.Random;
import java.util.Scanner;
public class Main {

	
	
	public static void main(String[] args) {
		Random r=new Random();
		Scanner inp = new Scanner(System.in);
		
		Farmer farmer[]= new Farmer[500];
		Soldier soldier[]= new Soldier[500];
		Cyborg cyborg[]= new Cyborg[500];
		Miner miner[]=new Miner[500];
		int HPowerTot=0;
		int APowerTot=0;
		int Cont=0;
		int sayac=0;
		int MainPoints=0;
		while(Cont !=-1) {
			HPowerTot=0;
			APowerTot=0;
			for(int i=0;i<500;i++) {
			int j=r.nextInt(2);
			if (j==0) {
			miner[i] = new Miner(r.nextInt(10),r.nextInt(10)); 
			APowerTot=APowerTot+miner[i].PowerCalc(miner[i]);
		
			}
			else {
				cyborg[i] = new Cyborg(r.nextInt(10),r.nextInt(10)); 
				APowerTot=APowerTot+cyborg[i].PowerCalc(cyborg[i]);
				
			}
		}
		
		for(int i=0;i<500;i++) {
			int j=r.nextInt(2);
			if (j==0) {
			farmer[i] = new Farmer(r.nextInt(10),r.nextInt(10)); 
			HPowerTot=HPowerTot+farmer[i].PowerCalc(farmer[i]);
		
			}
			else {
				soldier[i] = new Soldier(r.nextInt(10),r.nextInt(10)); 
				HPowerTot=HPowerTot+soldier[i].PowerCalc(soldier[i]);
				
			}
		}
		sayac++;
		MainPoints=MainPoints+(HPowerTot-APowerTot);
		System.out.println(sayac+". round point="+(HPowerTot-APowerTot));
		System.out.println("Enter Any Value to Play Another Round");
		System.out.println("If you want to finish the game, enter the value -1");
		Cont = inp.nextInt();
		
		}
		
		System.out.println(MainPoints);
    
		
		
	}

}
