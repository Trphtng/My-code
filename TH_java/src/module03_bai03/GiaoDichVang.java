package module03_bai03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaivang;

	public GiaoDichVang(String magd, LocalDate ngaygd, double dongia, double soluong, String loaivang) {
		super(magd, ngaygd, dongia, soluong);
		this.loaivang = loaivang;
	}

	public String getLoaivang() {
		return loaivang;
	}

	public void setLoaivang(String loaivang) {
		this.loaivang = loaivang;
	}
	
	@Override 
	double ThanhTien() {
		return super.getSoluong()*super.getDongia();
	}

	@Override
	public String toString() {
		return "GiaoDichVang [loaivang= " + loaivang + super.toString() + "]";
	}
	
	

}
