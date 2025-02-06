package assetTypes;

import java.time.LocalDate;

public class HighVoltageCircuitBreaker extends CircuitBreaker{

	public Integer ratePower;
	public HighVoltageCircuitBreaker(LocalDate installDate,Integer ratePower) {
		super(installDate);
		this.ratePower = ratePower;
		if(ratePower>1300) {
			deActivate();
		}
		else {
			if(!protectionDevice) {
				activate();
			}
		}
	}
	@Override
	public Double ageFactorInPercent() {
		return null;
	}
	@Override
	public String getType() {
		return null;
	}	
}
