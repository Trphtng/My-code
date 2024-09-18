package module03_bai04;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	private String loainha, diachi;
	private double dientich;
	
	public GiaoDichNha(String magd, LocalDate ngaygd, double dongia,String loainha,String diachi, double dientich) {
		super(magd, ngaygd, dongia);
		this.dientich = dientich;
		this.diachi = diachi;
		this.loainha = loainha;
	}

	@Override
	double ThanhTien() {
		if (loainha == "cao cap" )
			return dientich*getDongia();
		else 
			return dientich*getDongia()*0.9;
	}

	@Override
	public String toString() {
		return "GiaoDichNha [loainha=" + loainha + ", diachi=" + diachi + ", dientich=" + dientich + super.toString() + "]";
	}
	
	
	
}
