package uts;

import java.util.ArrayList;
import java.util.Scanner;

public class GuitarApp {
	Scanner scan = new Scanner(System.in);
	GuitarController guitarController = new GuitarController();
	ArrayList<Guitar> arrGuitar = new ArrayList<>();
	
	public GuitarApp(boolean onApp) {
		int menu = 0;
		
		while(onApp) {
			System.out.println("1. Build Guitar");
			System.out.println("2. Display List of Guitar");
			System.out.println("3. Exit");
			System.out.print("Choose menu[1..3]: ");
			do {
				menu = scan.nextInt();
			}while(menu < 1 || menu > 3);
			
			switch (menu) {
			case 1:
				guitarController.build(arrGuitar);
				break;
			case 2:
				guitarController.display(arrGuitar);
				break;
			case 3:
				break;
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		new GuitarApp(true);

	}

}
