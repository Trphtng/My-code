package module02_bai9;

import java.time.LocalDate;

public class Sotietkiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTiengui;
	private int kyhan;
	private float laisuat;

	public Sotietkiem(String maSo, LocalDate ngayMoSo, double soTiengui, int kyhan, float laisuat) {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setsoTiengui(soTiengui);
		setKyhan(kyhan);
		setLaisuat(laisuat);

	}

	public String getmaSo() {
		return this.maSo;

	}

	public LocalDate getNgayMoSo() {
		return this.ngayMoSo;
	}

	public int SothangGui() {
		return this.SothangGui();
	}

	public float getLaisuat() {
		return this.laisuat;
	}

	public double getsoTienGui() {
		return this.soTiengui;
	}

	public int getKyhan() {
		return this.kyhan;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public void setLaisuat(float laisuat) {
		this.laisuat = laisuat;
	}

	public void setsoTiengui(double soTiengui) {
		this.soTiengui = soTiengui;
	}

	public void setKyhan(int kyhan) {
		this.kyhan = kyhan;
	}

	public int tinhSoThangGoiThuc() {
		return kyhan;

	}

	public double tinhTienLai() {
		int soThangGoiThuc = tinhSoThangGoiThuc();
		return soTiengui * (laisuat / 100) * soThangGoiThuc;
	}

	public String toString() {
		return "SoTietKiem{" + "maSo='" + this.maSo + '\'' + ", ngayMo=" + this.ngayMoSo + ", soTienGoi="
				+ this.soTiengui + " kyHan=" + this.kyhan + ", laiSuat=" + this.laisuat + '}';
	}

}
