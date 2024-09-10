package module02_bai3;

public class Tamgiac {
	// attributes
	private float ma, mb, mc;

	// constructor
	public Tamgiac() {
		this.ma = 0;
		this.mb = 0;
		this.mc = 0;
	}

	public Tamgiac(float ma, float mb, float mc) {
		if (!check(ma, mb, mc)) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		} else {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
	}

	// methods
	public boolean check(float a, float b, float c) {
		if ((a < 0 || b < 0 || c < 0) && (a + b < c || a + c < b || b + c < a))
			return false;
		return true;
	}

	public void setma(float ma) {
		this.ma = ma;
	}

	public void setmb(float mb) {
		this.mb = mb;
	}

	public void setmc(float mc) {
		this.mc = mc;
	}

	public float getma() {
		return this.ma;
	}

	public float getmb() {
		return this.mb;
	}

	public float getmc() {
		return this.mc;
	}

	public double chuvi(float a, float b, float c) {
		return a + b + c;
	}

	public double dientich(float a, float b, float c) {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}

	public String Kieutamgiac(float a, float b, float c) {
		if (!check(a, b, c))
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
				"ma", ma, "mb", mb, "mc", mc, "KieuTamgiac", Kieutamgiac(ma, mb, mc), "Chuvi", chuvi(ma, mb, mc),
				"DienTich", dientich(ma, mb, mc));
	}
}
