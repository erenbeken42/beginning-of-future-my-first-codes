package StrategyGame;

public class Player2 {
	private int Power;
	private int Type;
	private String TypeName;
	public void setPower(int power) {
		Power=power;
	}
    public int getPower() {
    	return Power;
    }
    public void setType(int type) {
		Type=type;
	}
    public int getType() {
    	return Type;
    }
    
    public String getTypeName() {
    	if(Type==1) {
    		TypeName="Warrior";
    	}
    	else {
    		TypeName="Farmer";
    	}
    	return TypeName;
    }
    
    
}
