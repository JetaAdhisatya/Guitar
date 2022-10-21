package uts;

//menggunakan komposisi untuk gitar listrik karena membutuhkan gitar dan juga pickup
public class ElectricGuitar extends Guitar{
	PickUpElectrical electric = new PickUpElectrical();
	
	public ElectricGuitar(int choose, String type, int tone, int volume, int switchPosition) {
		super(choose, type);
		electric.setTone(tone);
		electric.setVolume(volume);
		electric.setSwitchPosition(switchPosition);
	}

	public int getTone() {
		return electric.getTone();
	}

	public int getVolume() {
		return electric.getVolume();
	}

	public int getSwitchPosition() {
		return electric.getSwitchPosition();
	}

	public void print() {
		System.out.println(getType() + " - " + getSoundType() + " - " + getTone() + " - " + getVolume() + " - " + getSwitchPosition());
	}
	
}
