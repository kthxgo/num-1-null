package controller;

public class Bisektion {

	Funktion f;
	
	public Bisektion() {
		f = new Funktion();
	}
	
	public double[] doIt(double grenzen[]) {
//		System.out.println((grenzen[0]+grenzen[1])/2);
		double y = f.getResult((grenzen[0]+grenzen[1])/2);
		double result[] = new double[2];
		
		
		if (y == 0) {
			//Nullstelle gefunden
			result[0] = (grenzen[0]+grenzen[1])/2;
			result[1] = (grenzen[0]+grenzen[1])/2;
		} else if (y < 0) {
			result[0] = (grenzen[0]+grenzen[1])/2;
			result[1] = grenzen[1];
		} else if (y > 0) {
			result[0] = grenzen[0];
			result[1] = (grenzen[0]+grenzen[1])/2;
		}
		
		return result;
	}
	
}
