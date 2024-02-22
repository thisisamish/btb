package Main;

import java.util.ArrayList;

import Extendables.Device;
import Extendables.Electronics;
import Extended.Mobile;
import Extended.SmartCard;
import Extended.Television;

public class Main {
	public static void main(String[] args) {
		ArrayList<Device> devices = new ArrayList<>();
		devices.add(new Television("MiTV", "1.0", "123"));
		devices.add(new Mobile("Galaxy S23", "2.6", "456"));
		devices.add(new SmartCard("Amish", "11.0.1", "8999"));
		devices.add(new Television("6989"));
		devices.add(new SmartCard("4444"));
		
		for (Device d: devices) {
			showDetails(d);
		}
		
		for (Device d: devices) {
			turnon(d);
		}
		
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		
//		for (Device d: devices) {
//			d.upgrade();
//			showDetails(d);
//		}
	}
	
	public static void turnon(Object obj) {
		if (obj instanceof Electronics) {
			((Electronics)obj).turnon();
			System.out.println();
		}
	}
	
	public static void showDetails(Device d) {
		System.out.println("Device Name: " + d.getDeviceName());
		System.out.println("Version: " + d.getVersion());
		System.out.println("Device ID: " + d.getId());
		System.out.println("Device Type: " + d.getClass().getSimpleName());
		System.out.println();
	}
}
