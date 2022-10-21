package uts;


//tetapi ini menggunakan agregasi sebagai listrik akustik juga membutuhkan gitar tetapi dapat digunakan tanpa pickup
public class AccousticElectricGuitar extends Guitar{
	PickUp pu = new PickUp();

	public AccousticElectricGuitar(int choose, String soundType, int tone, int volume) {
		super(choose, soundType);
		pu.setTone(tone);
		pu.setVolume(volume);
	}
	
	public int getTone() {
		return pu.getTone();
	}
	
	public int getVolume() {
		return pu.getVolume();
	}
	
	public void print() {
		System.out.println(getType() + " - " + getSoundType() + " - " + getTone() + " - " + getVolume());
	}
}
