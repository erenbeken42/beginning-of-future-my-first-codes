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
		int DGucTop=0;
		int UGucTop=0;
		int devam=0;
		int sayac=0;
		int AnaPuan=0;
		while(devam !=-1) {
			DGucTop=0;
			UGucTop=0;
			for(int i=0;i<500;i++) {
			int j=r.nextInt(2);
			if (j==0) {
			miner[i] = new Miner(r.nextInt(10),r.nextInt(10)); 
			UGucTop=UGucTop+miner[i].GucHesapla(miner[i]);
		
			}
			else {
				cyborg[i] = new Cyborg(r.nextInt(10),r.nextInt(10)); 
				UGucTop=UGucTop+cyborg[i].GucHesapla(cyborg[i]);
				
			}
		}
		
		for(int i=0;i<500;i++) {
			int j=r.nextInt(2);
			if (j==0) {
			farmer[i] = new Farmer(r.nextInt(10),r.nextInt(10)); 
			DGucTop=DGucTop+farmer[i].GucHesapla(farmer[i]);
		
			}
			else {
				soldier[i] = new Soldier(r.nextInt(10),r.nextInt(10)); 
				DGucTop=DGucTop+soldier[i].GucHesapla(soldier[i]);
				
			}
		}
		sayac++;
		AnaPuan=AnaPuan+(DGucTop-UGucTop);
		System.out.println(sayac+". turun puanı="+(DGucTop-UGucTop));
		System.out.println("Bir Tur Daha Oynamak İçin Herhangi Bir Değer Gİrin");
		System.out.println("Oyunu Bitirmek İstiyorsanız -1 Değerini Giriniz");
		devam = inp.nextInt();
		
		}
		
		System.out.println(AnaPuan);
    
		
		
	}

}
