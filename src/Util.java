package uts;

//util digunakan untuk merandom sound dan memilih musci genre apa

import java.util.Random;
import java.util.Scanner;

public class Util {
	Scanner scan =  new Scanner(System.in);
	
	public String randomAccoustic() {
		Random rand = new Random();
		int x = rand.nextInt(2);
		return (x == 0) ? "warm" : "bright";
	}
	
	public String Electric(int choose) {
		if(choose == 1) {
			return "Funk";
		}else if(choose == 2) {
			return "Jazz";
		}else if(choose == 3) {
			return "Blues";
		}else {
			return "Rock";
		}
	}
}
