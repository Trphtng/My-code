package bai02;

public class SinhVien {
	// class attributes

	int maSV;
	String name;
	int DiemLT, DiemTH;

	// class methods
	public SinhVien() {
		this.maSV = 2;
		this.name = "Nguyen Dat Thanh";
		this.DiemLT = 5;
		this.DiemTH = 5;

	}

	public SinhVien(int maSV, String name, int LT, int TH) {
		this.maSV = maSV;
		this.name = name;
		this.DiemLT = LT;
		this.DiemTH = TH;
	}

	// Getter and setter for attributes maSV
	public int getMaSV() {
		return maSV;
	}

	public void setmaSV(int maSV) {
		if (maSV > 0) {
			this.maSV = maSV;
		} else {
			this.maSV = 0;
		}
	}

	// Getter and setter for attributes name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			this.name = "Unknown";
		} else {
			this.name = name;
		}
	}

	// Getter and setter for attributes diemLT
	public int getDiemLT() {
		return DiemLT;
	}

	public void setDiemLT(int DiemLT) {
		if (DiemLT > 0) {
			this.DiemLT = DiemLT;
		} else {
			this.DiemLT = -1;
		}

	}

	// Getter and setter for attributes diemTH
	public int getDiemTH() {
		return DiemTH;
	}

	public void setDiemTH(int DiemTH) {
		if (DiemTH > 0) {
			this.DiemTH = DiemTH;
		} else {
			this.DiemTH = -1;
		}
	}

	// average score
	public double AverScore() {
		return (DiemLT + DiemTH) / 2.0;
	}

	public String toString() {
		return "MaSV: " + maSV + ";" + name + ";" + "DiemLT: " + DiemLT + "DiemTH: " + DiemTH;
	}

}
