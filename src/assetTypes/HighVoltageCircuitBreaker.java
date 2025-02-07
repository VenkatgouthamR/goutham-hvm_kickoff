package assetTypes;

import java.time.LocalDate;

public class HighVoltageCircuitBreaker extends CircuitBreaker{

	private Integer ratePower;
	public HighVoltageCircuitBreaker(LocalDate installDate,Integer ratePower) {
		super(installDate);
		this.ratePower = ratePower;
		if(ratePower>1300) {
			deActivate();
		}
		else {
			if(!isProtectionDevice()) {
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
	public Integer getRatePower() {
		return ratePower;
	}
	public void setRatePower(Integer ratePower) {
		this.ratePower = ratePower;
	}
	
	
}
