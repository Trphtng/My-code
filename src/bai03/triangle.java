package bai03;

public class triangle {
	// class attributes
	double ma, mb, mc;

	// constructor
	public triangle() {

	}

	public triangle(double a, double b, double c) {
		if (a <= 0 || b <= 0 || c <= 0 || !isTriangle(a, b, c)) {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		} else {
			this.ma = a;
			this.mb = b;
			this.mc = c;
		}
	}

	public double getSideA() {
		return ma;
	}

	public double getSideB() {
		return mb;
	}

	public double getSideC() {
		return mc;
	}

	// Setter methods
	public void setSideA(double a) {
		if (a > 0 && isTriangle(a, this.mb, this.mc)) {
			this.ma = a;
		}

	}

	public void setSideB(double b) {
		if (b > 0 && isTriangle(this.ma, b, this.mc)) {
			this.mb = b;
		}
	}

	public void setSideC(double c) {
		if (c > 0 && isTriangle(this.ma, this.mb, c)) {
			this.mc = c;
		}
	}

	public boolean isTriangle(double a, double b, double c) {
		return a + b > c && a + c > b && b + c > a;

	}

	public double perimeter(double a, double b, double c) {
		return a + b + c;
	}

	public double area(double a, double b, double c) {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}

	public String TriangleTypes(double a, double b, double c) {
		if (!isTriangle(a, b, c))
			return "Ko la tam giac";
		if (a == b || a == c || b == c) {
			if (a == b && a == c && c == a)
				return "Tam giac deu";
			return "Tam giac can";
		} else {
			return "Tam giac thuong";
		}
	}

	public String toString() {
		return String.format("%-10s = %-8.2f %-10s = %-8.2f %-10s = %-8.2f %-15s = %-15s %-10s = %-8.2f %-10s = %-8.2f",
				"ma", ma, "mb", mb, "mc", mc, "Triangle Type", TriangleTypes(ma, mb, mc), "Perimeter",
				perimeter(ma, mb, mc), "Area", area(ma, mb, mc));
	}

}
