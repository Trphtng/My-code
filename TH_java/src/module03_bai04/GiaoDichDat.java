package module03_bai04;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich{
	private String loaidat;
	private double dientich;
	public GiaoDichDat(String magd, LocalDate ngaygd, double dongia,String loaidat,double dientich) {
		super(magd, ngaygd, dongia);
		this.loaidat = loaidat;
		this.dientich = dientich;
	}
	@Override
	double ThanhTien() {
		if(this.loaidat == "C" || this.loaidat == "B")
			return this.dientich*this.getDongia();
		else
			return this.dientich*getDongia()*1.5;
	}
	public String getLoaidat() {
		return loaidat;
	}
	public void setLoaidat(String loaidat) {
		this.loaidat = loaidat;
	}
	public double getDientich() {
		return dientich;
	}
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	@Override
	public String toString() {
		return "GiaoDichDat [loaidat=" + loaidat + ", dientich=" + dientich  + super.toString() + "]";
	}
	
	
	
	
	

}
