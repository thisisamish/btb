package Extended;

import Extendables.Device;

public class SmartCard extends Device {
	public SmartCard(String name, String version, String id) {
		super(name, version, id);
	}
	
	public SmartCard(String id) {
		super(id);
	}
}
