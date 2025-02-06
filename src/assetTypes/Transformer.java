package assetTypes;

import java.time.LocalDate;

public abstract class Transformer extends Asset {
	public Transformer(LocalDate installDate) {
		super(installDate);
	}

	public 	Integer voltageLevel;
	
	CollingMethod collingMethod = CollingMethod.AIRCOOLING;

	public Integer getVoltageLevel() {
		return voltageLevel;
	}

	public void setVoltageLevel(Integer voltageLevel) {
		this.voltageLevel = voltageLevel;
	}

	public CollingMethod getCollingMethod() {
		return collingMethod;
	}

	public void setCollingMethod(CollingMethod collingMethod) {
		this.collingMethod = collingMethod;
	}
}
