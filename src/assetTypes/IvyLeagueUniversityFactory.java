package assetTypes;

public class IvyLeagueUniversityFactory extends UniversityFactory {

	@Override
	public AdmitCard getAdmitCard(String course) {
		switch(course) {
		case "Math":
			return new VNRAdmitCard();
		case "CS":
			return new CBITAdmitCard();
		default:
			return null;
		}
	}

	@Override
	public FeeCalculator getFeeCalculator(String course) {
		switch(course) {
		case "Math":
			return new VNRFeeCalculator();
		case "CS":
			return new CBITFeeCalculator();
		default:
			return null;
		}
	}
}
