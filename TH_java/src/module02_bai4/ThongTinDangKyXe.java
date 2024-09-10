package module02_bai4;

public class ThongTinDangKyXe {
	// attributes
	private String tenchu;
	private String loaixe;
	private float giaxe;
	private int xilanh;
	private float thue;

	// constructor
	public ThongTinDangKyXe() {
		this.tenchu = "";
		this.giaxe = 0;
		this.loaixe = "";
		this.xilanh = 0;
		this.thue = 0;
	}

	public ThongTinDangKyXe(String tenchu, String loaixe, float giaxe, int xilanh) {
		this.tenchu = tenchu;
		this.giaxe = giaxe;
		this.loaixe = loaixe;
		this.xilanh = xilanh;
	}

	// set,get
	public void settenchuxe(String tenchuxe) {
		this.tenchu = tenchuxe;
	}

	public void setloaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public void setgiaxe(float giaxe) {
		if (giaxe >= 0)
			this.giaxe = giaxe;
		else
			this.giaxe = 0;
	}

	public void setxilanh(int xilanh) {
		if (xilanh >= 0)
			this.xilanh = xilanh;
		else
			this.xilanh = 0;
	}

	public void setthue(float thue) {
		this.thue = thue;
	}

	public String gettenchuxe() {
		return tenchu;
	}

	public String getloaixe() {
		return loaixe;
	}

	public float setgiaxe() {
		return giaxe;
	}

	public float thue() {
		return thue;
	}

	public int xilanh() {
		return xilanh;
	}

	// methods
	public float tinhthue(int xilanh, float giaxe) {
		if (xilanh < 100) {
			return giaxe * 0.01f;
		} else if (xilanh <= 200) {
			return giaxe * 0.03f;
		} else {
			return giaxe * 0.05f;
		}
	}

	public String toString() {
		return String.format("%-25s %-15s %-10f %-15d %-15.2f%n", tenchu, loaixe, giaxe, xilanh,
				tinhthue(xilanh, giaxe));
	}
}
