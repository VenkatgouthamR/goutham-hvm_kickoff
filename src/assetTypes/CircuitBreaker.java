package assetTypes;

import java.time.LocalDate;

public abstract class CircuitBreaker extends Asset{

	private boolean protectionDevice;
	public CircuitBreaker(LocalDate installDate) {
		super(installDate);
	}
	
	public void activate() {
		protectionDevice = true;
	}
	
	public void deActivate() {
		protectionDevice = false;
	}
	
	public boolean isProtectionDevice() {
		return protectionDevice;
	}
	
	public void isActivated() {
		System.out.println(protectionDevice ? 
				"ProtectionDevice is activated" : "ProtectionDevice is deActivated");
	}
}
