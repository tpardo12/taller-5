package demo;

public class USDollarCurrency implements USDollar {

	@Override
	public double showInDollar(int price) {
		double dollar = (double)price/3700;
		return dollar;
	}

}
