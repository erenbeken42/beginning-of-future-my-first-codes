package HumansVsAilens;

public class Soldier extends Human{
	public int AttackPower;
	
	public Soldier(int protect,int attackPower) {
		ProtectHuman=protect;
		AttackPower=attackPower;
	}

	public int getAttackPower() {
		return AttackPower;
	}

	public void setAttackPower(int attackPower) {
		AttackPower = attackPower;
	}

	public int GucHesapla(Soldier soldier1) {
		int top =0;
		top=soldier1.getAttackPower()*soldier1.getProtect()	;
		return top;
		
	}
}
