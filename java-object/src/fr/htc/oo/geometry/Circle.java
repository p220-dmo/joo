package fr.htc.oo.geometry;

class Circle {
	public double x; // coordonnées du centre
	public double y; 
	private double r; // rayon du cercle

	public Circle(double r) {
		this.r = r;
	}

	public Circle(double a, double b, double c) {
		x = a;
		y = b;
		r = c;
	}
	
	public double area() {
		return 3.14159 * r * r;
	}
	
	public double area2() {
		return Math.PI * Math.pow(r, 2);
	}

}
