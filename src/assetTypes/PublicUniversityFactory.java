package assetTypes;

public class PublicUniversityFactory extends UniversityFactory{

	@Override
	public AdmitCard getAdmitCard(String course) {
		switch(course) {
		case "Math":
			return new USCAdmitCard();
		case "CS":
			return new VSUAdmitCard();
		default:
			return null;
		}
	}

	@Override
	public FeeCalculator getFeeCalculator(String course) {
		switch(course) {
		case "Math":
			return new USCFeeCalculator();
		case "CS":
			return new VSUFeeCalculator();
		default:
			return null;
		}
	}
	

}
