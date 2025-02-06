package assetTypes;

import java.time.LocalDate;

public abstract class Asset {
	enum CollingMethod{
		AIRCOOLING,OILIMMERSED;
	}
	public LocalDate installDate;
	
	public Asset(LocalDate installDate) {
		this.installDate = installDate;
	}
	
	public abstract Double ageFactorInPercent();
	
	public abstract String getType();
}
