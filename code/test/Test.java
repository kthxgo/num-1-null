package test;

import controller.Funktion;
import controller.Bisektion;
import controller.Regulafalsi;

public class Test {

	public static void main(String[] args) {
		Bisektion nst = new Bisektion();
		double[] grenzen = new double[2];
		grenzen[0] = (double) 0.0;
		grenzen[1] = (double) 3.0;
		
		int max = 1000;
		int grenze = max;
		
		
		double[] result = new double[2];
		result = nst.doIt(grenzen);
		
		while((result[0] != result[1]) && grenze>0) {
			grenze--;
			result = nst.doIt((double[]) result);
		}
		
		System.out.println(result[0]);
		System.out.println("#Bisektion » Nach " + (max-grenze) + " Schleifendurchlaeufen (max: " + max + ")");
		System.out.println();
		
		Regulafalsi regf = new Regulafalsi();
		grenze = max;
		double[] result2 = new double[2];
		result2 = regf.getNst(grenzen);
		
		while((result2[0] != result2[1]) && grenze>0) {
			grenze--;
			result2 = regf.getNst((double[]) result2);
		}
		
		System.out.println(result2[0]);
		System.out.println("#Regula falsi » Nach " + (max-grenze) + " Schleifendurchlaeufen (max: " + max + ")");
		System.out.println();
		System.out.println("wird immer alle Schleifendurchlauefe brauchen weil es nie genau gleich ist - bräuchte Genauigkeitsangabe");
	}
	
}
