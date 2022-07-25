package mobile;

public class Otab extends Mobile{
	public Otab() {}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		int battery = getBatterySize();
		setBatterySize(battery -= time * 12);
	}
	
	@Override
	public void charge(int time) {
		int batter = getBatterySize();
		setBatterySize(batter += time * 8);
	}
}
