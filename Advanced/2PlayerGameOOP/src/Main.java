
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Avatar avatar1[] = new Avatar[5];
		Avatar avatar2[] = new Avatar[5];
		Random r=new Random();
		int puan1=0;
		int puan2=0;
		

	for(int i=0; i<avatar1.length; i++) {
		avatar1[i] = new Avatar();
		avatar2[i] = new Avatar();
		avatar1[i].setGuc(r.nextInt(10));
		avatar2[i].setGuc(r.nextInt(10));
		avatar1[i].setTur(r.nextInt(2));
		avatar2[i].setTur(r.nextInt(2));
	}
	for(int i=0; i<avatar1.length; i++) {
		System.out.println("1. oyuncunun "+(i+1)+". turdaki tür ve gücü");
		System.out.println(avatar1[i].getTur()+" "+avatar1[i].getGuc());
		System.out.println("2. oyuncunun "+(i+1)+". turdaki tür ve gücü");
		System.out.println(avatar2[i].getTur()+" "+avatar2[i].getGuc());
	}
	
	
	
	
	for(int i=0; i<avatar1.length; i++) {
		if(avatar1[i].getTur()==avatar2[i].getTur()) {
			if(avatar1[i].getGuc()>avatar2[i].getGuc()) {
				puan1=puan1+avatar1[i].getGuc()-avatar2[i].getGuc();
			System.out.println((i+1)+".turun kazananı 1.oyuncu"+" bu tur kazanılan + "+(avatar1[i].getGuc()-avatar2[i].getGuc()));
			}
			else if(avatar1[i].getGuc()<avatar2[i].getGuc()) {
				puan2=puan2+avatar2[i].getGuc()-avatar1[i].getGuc();
				System.out.println((i+1)+".turun kazananı 2.oyuncu"+" bu tur kazanılan + "+(avatar2[i].getGuc()-avatar1[i].getGuc()));}
			
			
			
			else {
				System.out.println((i+1)+".turda kimse kazanmadı");
			}
		
		}
	else if(avatar1[i].getTur()>avatar2[i].getTur()) {
			puan1=puan1+10;
			System.out.println((i+1)+".turun kazananı 1.oyuncu bu tur kazanılan +10");
		}
	else {
		puan2=puan2+10;
		System.out.println((i+1)+".turun kazananı 2.oyuncu bu tur kazanılan +10");
	}
	}
	if(puan1>puan2) {
		System.out.println("1.oyuncu"+puan1+"puanla kazandı");
	}
	else if(puan2>puan1) {
		System.out.println("2.oyuncu"+puan2+"puanla kazandı");
	}
	else {
		System.out.println("puanlar eşit kimse kazanamadı"+puan1);
	}
	}

}
