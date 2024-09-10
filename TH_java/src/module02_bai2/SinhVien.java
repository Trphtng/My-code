package module02_bai2;

public class SinhVien {
	// attributes
	private int masv;
	private String hoten;
	private float diemlt;
	private float diemth;

	// constructor
	public SinhVien() {
		this.masv = 0;
		this.hoten = "";
		this.diemlt = 0;
		this.diemth = 0;
	}

	public SinhVien(int masv, String hoten, float diemlt, float diemth) {
		this.masv = masv;
		this.hoten = hoten;
		this.diemlt = diemlt;
		this.diemth = diemth;
	}

	// set,get
	public void setmasv(int masv) {
		this.masv = masv;
	}

	public void sethoten(String hoten) {
		this.hoten = hoten;
	}

	public void setdiemlt(float diemlt) {
		if (check(diemlt))
			this.diemlt = diemlt;
		this.diemlt = 0;
	}

	public void setdiemth(float diemth) {
		if (check(diemth))
			this.diemth = diemth;
		this.diemth = 0;
	}

	public int getmasv() {
		return masv;
	}

	public String gethoten() {
		return hoten;
	}

	public float getdiemlt() {
		return diemlt;
	}

	public float getdiemth() {
		return diemth;
	}

	// methods
	public double diemtb(float diemlt, float diemth) {
		return (diemlt + diemth) / 2;
	}

	public boolean check(float diem) {
		if (diem >= 0 && diem <= 10)
			return true;
		return false;
	}

	public String toString() {
		return "masv: " + masv + " hoten: " + hoten + " diemLT: " + diemlt + " diemTH: " + diemth + " diemTB: "
				+ diemtb(diemlt, diemth);
	}
}
