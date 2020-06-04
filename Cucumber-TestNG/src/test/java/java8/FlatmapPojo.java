package java8;

import java.util.HashSet;
import java.util.Set;

public class FlatmapPojo {



	private String name;
	private Set<String> devices;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void addDevices(String deviceName)
	{
		
		if(this.devices==null){
			this.devices = new HashSet<String>();
		}
	
		this.devices.add(deviceName);
	}
	

	public Set<String> getDevices() {
		return devices;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", devices=" + devices + "]";
	}
}
