package controller;

public class Regulafalsi {

	Funktion f;
	
	public Regulafalsi() {
		f = new Funktion();
	}
	
	public double[] getNst(double[] grenzen) {
		double[] result = new double[2];
		double x1 = grenzen[0];
		double x2 = grenzen[1];
		double x3 = x1 + f.getResult(x1) * ((x2-x1)/(f.getResult(x1)-f.getResult(x2)));
		double y = f.getResult(x3);
		
		if (y == 0) {
			//Nullstelle gefunden
			result[0] = x3;
			result[1] = x3;
		} else if (y < 0) {
			result[0] = x3;
			result[1] = x2;
		} else if (y > 0) {
			result[0] = x1;
			result[1] = x3;
		}
		
		return result;
	}
	
}
