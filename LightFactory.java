package org.practice.marathahalli;

public class LightFactory {
	 static Iswitch  getLihght(String type) {
		if(type.equalsIgnoreCase("LedLight")) {
			return new LedLight();
		}
		else if (type.equalsIgnoreCase("TubeLight")) {
			return new TubeLight();
		}
		else {
			System.out.println("no such light found");
			return null;
		}
	}
 
}
