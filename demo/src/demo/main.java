package demo;
import java.util.Scanner;
import java.util.Vector;
 

public class main {

	public static void main(String[] args) {
		Currency currency = new Currency ();
		System.out.print("Input your currency [USD|YEN]: ");
		Scanner input = new Scanner(System.in);
		String cur = input.nextLine();
		
		if(cur.equals("IDR") || cur.equals("USD") || cur.equals("YEN")) {
			if(cur.equals("USD")) {
				USDollarCurrency dolar = new USDollarCurrency();
				double dollars = currency.convertToUSDollar(dolar, 3000);
				System.out.print(dollars);
					
			}
			else if(cur.equals("YEN")) {
				YenCurrency yen = new YenCurrency();
				double yens = currency.convertToYen(yen, 31);
				System.out.print(yens);
				
			}
			boolean currencyValidation = true;
		}

	}

}
