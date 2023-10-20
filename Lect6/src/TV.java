
public class TV {
	int channel = 1;
	int volume = 10;
	boolean on = false;
	
//construct 
	TV() {
	
	}
	
	TV(int newVol) {
		volume = newVol;
	}
	
//methods
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
}
