package abstractExample;

public class Main {

	public static void main(String[] args) {
		GameCalculator gameCalculator = new WomenGameCalculator();
	gameCalculator.calculate();
	gameCalculator.gameOver();
	}

}
