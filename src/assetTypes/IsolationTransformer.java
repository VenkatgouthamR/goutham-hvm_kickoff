package assetTypes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IsolationTransformer extends Transformer{
	
	public Integer clampingVoltage;
	public IsolationTransformer(LocalDate installDate) {
		super(installDate);
	}

	@Override
	public Double ageFactorInPercent() {
		return Math.abs(1.0-ChronoUnit.YEARS.between(installDate,LocalDate.now())/20.0);
	}

	@Override
	public String getType() {
		return "Transformer.IsolationTransformer";
	}

	public Integer getClampingVoltage() {
		return clampingVoltage;
	}

	public void setClampingVoltage(Integer clampingVoltage) {
		this.clampingVoltage = clampingVoltage;
	}
}
