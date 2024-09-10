package module02_bai1;

public class HinhChuNhat {
	private float dai, rong;

	// constructor
	public HinhChuNhat() {
		this.dai = 0;
		this.rong = 0;
	}

	public HinhChuNhat(int dai, int rong) {
		this.dai = dai;
		this.rong = rong;
	}

	// set,get
	public void setDai(int dai) {
		this.dai = dai;
	}

	public void setrong(int rong) {
		this.rong = rong;
	}

	public float getDai() {
		return this.dai;
	}

	public float getRong() {
		return this.rong;
	}

	// method
	public float Chuvi(float dai, float rong) {
		return (dai + rong) * 2;
	}

	public float Dientich(float dai, float rong) {
		return dai * rong;
	}

	public String toString() {
		return "cdai = " + dai + " crong = " + rong + " chuvi= " + Chuvi(dai, rong) + " Dientich= "
				+ Dientich(dai, rong);
	}
}
