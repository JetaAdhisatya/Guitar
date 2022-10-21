package uts;

public class Guitar {
	private String type;
	private String soundType;
	
	public Guitar(int choose, String soundType) {
		this.type = choosing(choose);
		this.soundType = soundType;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSoundType() {
		return soundType;
	}
	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	
	public String choosing(int choose) {
		if(choose == 1) {
			return "Acoustic Guitar";
		}else if(choose == 2) {
			return "Electric Guitar";
		}else if(choose == 3) {
			return "Accoustic Electric Guitar";
		}
		return null;
	}
	
	public void print() {
		System.out.println(type + " - " + soundType);
	}
	
	
}
