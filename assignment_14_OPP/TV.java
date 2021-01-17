package assignment_14_OPP;

public class TV {

	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	private String brand = "undefined";
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}
	public TV (String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	public void channelUp() {
		if (on) {
			if (channel > 0 && channel < 120) {
				channel++;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Channel");
			}
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}
	public void channelDown() {
		if (on) {
			if (channel > 0 && channel < 120) {
				channel--;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Channel");
			}
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}
	public void volumeUp() {
		if (on) {
			if (volumeLevel > 1 && volumeLevel < 7) {
				volumeLevel++;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	public void volumeDown() {
		if (on) {
			if (volumeLevel > 1 && volumeLevel < 7) {
				volumeLevel--;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	public boolean isOn() {
		return on;
	}
	public void turnOn() {
		if (on) {
			System.out.println("TV is already ON");
		} else {
			on = true;
		}
	}
	public void turnOff() {
		if (!on) {
			System.out.println("TV is already OFF");
		} else {
			on = false;
		}
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if (on) {
			if (channel >= 1 && channel <= 120) {
				this.channel = channel;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Channel");
			}
		}else {			
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if (on) {
			if (volumeLevel >= 1 && volumeLevel <= 7) {
				this.volumeLevel = volumeLevel;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}