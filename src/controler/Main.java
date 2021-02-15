package controler;

import model.Plateau;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plateau morpion = new Plateau(3,3);
		Scanner sc = new Scanner(System.in);
		System.out.println("                      ");
		System.out.println("Choisissez une case");
		morpion.m_choixcase = sc.nextLine();
		System.out.println(morpion.m_choixcase);
		
		
		//morpion.set(1,'X');
		//morpion.getCase(1);
		
		
		
		
		
	}

}
