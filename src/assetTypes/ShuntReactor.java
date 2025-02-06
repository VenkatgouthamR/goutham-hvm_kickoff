package assetTypes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ShuntReactor extends Transformer {

	public Integer reactivePowerCompensation;
	public ShuntReactor(LocalDate installDate) {
		super(installDate);
	}

	@Override
	public Double ageFactorInPercent() {
		return Math.abs(1.0-ChronoUnit.YEARS.between(installDate,LocalDate.now())/10.0);
	}

	@Override
	public String getType() {
		return "Transformers.ShuntReactor";
	}

	public Integer getReactivePowerCompensation() {
		return reactivePowerCompensation;
	}

	public void setReactivePowerCompensation(Integer reactivePowerCompensation) {
		this.reactivePowerCompensation = reactivePowerCompensation;
	}	 
}
