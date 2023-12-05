package project_1;

import java.util.Scanner;

public class smetkaa {
	public static void main(String[] args) {
		// jabolki - 50den kg, krusi - 60den kg, grozje - 100kg
		double smetka = 0;
		System.out.println("jabolkikg, krusi, grozje");
		Scanner tastatura = new Scanner(System.in);
		System.out.println( "jabolki: ");
		double jabolki = tastatura.nextDouble();
		System.out.println ("krusi:");
		double krusi = tastatura.nextDouble();
		System.out.println("grozje:");
		double grozje = tastatura.nextDouble();
		smetka = jabolki*50+krusi*60+grozje*100;
		System.out.println("Smetka iznesuva "+smetka+"denari");
		
	}
}
