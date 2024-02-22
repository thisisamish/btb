package Extended;

import Extendables.Device;
import Extendables.Electronics;

public class Television extends Device implements Electronics {
	public Television(String name, String version, String id) {
		super(name, version, id);
	}
	
	public Television(String id) {
		super(id);
	}
	
	public void turnon() {
		System.out.println(this.deviceName + " television was turned on.");
	}
	
	public void turnoff() {
		System.out.println(this.deviceName + " television was turned off.");
	}
}
