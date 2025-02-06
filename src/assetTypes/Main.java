package assetTypes;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) { 
		ShuntReactor reactor = new ShuntReactor(LocalDate.of(2002, 05, 05));
		Transformer transformer = reactor;
		transformer.voltageLevel = 15;
		reactor.voltageLevel = 10;
		System.out.println("Transformer.voltageLevel :" + transformer.voltageLevel);
	}
}
