package module03_bai03;

import java.time.LocalDate;

public abstract class GiaoDich {
	private String Magd;
	private LocalDate Ngaygd;
	private double dongia;
	private double soluong;
	
	public GiaoDich() {
		
	}

	public GiaoDich(String magd, LocalDate ngaygd, double dongia, double soluong) {
		Magd = magd;
		Ngaygd = ngaygd;
		this.dongia = dongia;
		this.soluong = soluong;
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

	public double getSoluong() {
		return soluong;
	}

	public void setSoluong(double soluong) {
		this.soluong = soluong;
	}
	
	abstract double ThanhTien();

	@Override
	public String toString() {
		return "Magd= " + Magd + ", Ngaygd= " + Ngaygd + ", dongia= " + dongia + ", soluong= " + soluong ;
	}
	
	

}
