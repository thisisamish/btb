package Extendables;

public class Device {
	protected String deviceName;
	protected String version;
	protected String id;
	
	public String getDeviceName() {
		return this.deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	public String getVersion() {
		return this.version;
	}
	
	public String getId() {
		return this.id;
	}
	
//	public void upgrade() {
//		try {
//			String[] temp = this.version.split(".");
//			for (String s: temp) System.out.println(s + " ");
//			temp[0] = String.valueOf(Integer.parseInt(temp[0]) + 1);
//			this.version = String.join(".", temp);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
	
	public Device(String deviceName, String version, String id) {
		this.deviceName = deviceName;
		this.version = version;
		this.id = id;
	}
	
	public Device(String id) {
		this.deviceName = "A device has no name";
		this.version = "0.0";
		this.id = id;
	}
}
