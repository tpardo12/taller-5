package demo;

public class YenCurrency implements Yen{

	@Override
	public double showInYen(int price) {
		double yen = (double) price / 31.28;
		return yen;
	}

}
