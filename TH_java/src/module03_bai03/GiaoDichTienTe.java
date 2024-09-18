package module03_bai03;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
	private String loaitiente;
	private double tigia;
	public GiaoDichTienTe(String magd, LocalDate ngaygd, double dongia, double soluong,String loaitiente, double tigia) {
		super(magd, ngaygd, dongia, soluong);
		this.loaitiente = loaitiente;
		this.tigia = tigia;
	}
	public String getLoaitiente() {
		return loaitiente;
	}
	public void setLoaitiente(String loaitiente) {
		this.loaitiente = loaitiente;
	}
	public double getTigia() {
		return tigia;
	}
	public void setTigia(double tigia) {
		this.tigia = tigia;
	}
	
	@Override 
	double ThanhTien() {
		return super.getSoluong()*getDongia()*this.tigia;
	}
	@Override
	public String toString() {
		return "GiaoDichTienTe [loaitiente= " + loaitiente + ", tigia= " + tigia  + super.toString()
				+ "]";
	}
	
	
}
