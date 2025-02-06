package assetTypes;

import java.time.LocalDate;

public abstract class CircuitBreaker extends Asset{

	public boolean protectionDevice;
	public CircuitBreaker(LocalDate installDate) {
		super(installDate);
	}
	
	public void activate() {
		protectionDevice = true;
	}
	
	public void deActivate() {
		protectionDevice = false;
	}
	
	public void isActivated() {
		System.out.println(protectionDevice ? 
				"ProtectionDevice is activated" : "ProtectionDevice is deActivated");
	}
}
