package uts;

import java.util.ArrayList;
import java.util.Scanner;

public class GuitarController {
	Scanner scan = new Scanner(System.in);
	Util random = new Util();
	
	public void build(ArrayList<Guitar> arrGuitar) {
		int input = 0;
		System.out.println("");
		System.out.println("1. Acoustic");
		System.out.println("2. Electric");
		System.out.println("3. Acoustic Electrical");
		System.out.print("Input Guitar type: ");
		try {
			input = scan.nextInt();
		} catch (Exception e) {
			
		}
		scan.nextLine();
		
		switch (input) {
		case 1:
			arrGuitar.add(new Guitar(input, random.randomAccoustic()));
			break;
		case 2:
			int switchPos, tone, volume;
			System.out.print("Input Switch position: ");
			switchPos = scan.nextInt();
			System.out.print("Input tone: ");
			tone = scan.nextInt();
			System.out.print("input volume: ");
			volume = scan.nextInt();
			arrGuitar.add(new ElectricGuitar(input, random.Electric(switchPos), tone, volume, switchPos));
			break;
		case 3:
			arrGuitar.add(new AccousticElectricGuitar(input, "crunch", 0, 0));
			break;
		}
		
	}
	
	public void display(ArrayList<Guitar> arrGuitar) {
		System.out.println("[GuitarType]-[GuitarSoundType]-[Tone]-[Volune]-[SwitchPosition]");
		for(Guitar guitar: arrGuitar) {
			guitar.print();
		}
	}
	
}
