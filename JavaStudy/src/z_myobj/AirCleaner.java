package z_myobj;

public class AirCleaner {
	public boolean powerSupply;
	public int level;
	public String quality;
	
	public AirCleaner() {
		this.powerSupply = false;
		this.level = 0;
		this.quality = "red";
	}
	
	public AirCleaner(boolean p, int l, String q) {
		this.powerSupply = p;
		this.level = l;
		this.quality = q;
	}
	
	public void info() {
		System.out.printf("전원: %s\n단계: %d\n품질: %s\n", this.powerSupply, this.level, this.quality);
	}
	
	
	
	
	
	
	
	public void powerOn() {
		powerSupply = true;
	}
	public void powerOff() {
		powerSupply = false;
	}
	
	
	public void high() {
		level += 1;
	}
	public void low() {
		level -= 1;
	}
	
	
	public void good() {
		quality = "0000FF";
	}
	public void bad() {
		quality = "FF0000";
	}
	
}
