package Extended;

import Extendables.Device;
import Extendables.Electronics;

public class Mobile extends Device implements Electronics {
	public Mobile(String name, String version, String id) {
		super(name, version, id);
	}
	
	public Mobile(String id) {
		super(id);
	}
	
	public void turnon() {
		System.out.println(this.deviceName + " mobile was turned on.");
	}
	
	public void turnoff() {
		System.out.println(this.deviceName + " mobile was turned off.");
	}
}
