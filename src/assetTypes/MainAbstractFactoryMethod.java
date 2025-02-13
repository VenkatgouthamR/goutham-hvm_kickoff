package assetTypes;

public class MainAbstractFactoryMethod {
	public static void main(String[] args) {
		int entranceExamScore = 109;
		UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversityFactory(entranceExamScore);
		
		AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
		admitCard.printAdmitCard();
		FeeCalculator feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
		System.out.println("Fee: " + feeCalculator.calculateFee());
	}
}
