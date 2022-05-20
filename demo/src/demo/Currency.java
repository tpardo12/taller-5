package demo;

public class Currency {
	public Currency() {
		
	}
	
	public double convertToUSDollar(USDollar dollar, int price) {
		return dollar.showInDollar(price);
	}
	
	public double convertToYen(Yen yen, int price) {
		return yen.showInYen(price);
	}
}
