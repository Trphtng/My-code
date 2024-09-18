package module03_bai04;

import java.time.LocalDate;

public abstract class GiaoDich {
	private String Magd;
	private LocalDate Ngaygd;
	private double dongia;
	
	
	public GiaoDich(String magd, LocalDate ngaygd, double dongia) {
		Magd = magd;
		Ngaygd = ngaygd;
		this.dongia = dongia;
	}


	public String getMagd() {
		return Magd;
	}


	public void setMagd(String magd) {
		Magd = magd;
	}


	public LocalDate getNgaygd() {
		return Ngaygd;
	}


	public void setNgaygd(LocalDate ngaygd) {
		Ngaygd = ngaygd;
	}


	public double getDongia() {
		return dongia;
	}


	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	abstract double ThanhTien();
	
	public String toString() {
		return "Magd=" + Magd + ", Ngaygd=" + Ngaygd + ", dongia=" + dongia ;
	}
	
	
}
