package module02_bai9;

public class Khachhang {
	private String maKH;
	private String hotenKH;
	private Sotietkiem[] dsSoTietKiem;
	private int soLuongSo;

	public Khachhang(String maKH, String HotenKH, int SoLuongSo) {
		this.maKH = maKH;
		setHotenKH(HotenKH);
		this.soLuongSo = SoLuongSo;

	}

	public Khachhang(int size) {
		dsSoTietKiem = new Sotietkiem[size];
		soLuongSo = 0;
	}

	public String getmaKH() {
		return this.maKH;
	}

	public String getHotenKH() {
		return this.hotenKH;
	}

	public Sotietkiem[] getDsSoTietKiem() {
		return this.dsSoTietKiem;
	}

	public int getSoLuongSo() {
		return this.soLuongSo;
	}

	public void setHotenKH(String HotenKH) {
		this.hotenKH = HotenKH;
	}

	public boolean themSoTietKiem(Sotietkiem a) {
		if (dsSoTietKiem == null) {
			System.out.println("Danh sách sổ tiết kiệm chưa được khởi tạo.");
			return false;
		}
		if (soLuongSo < dsSoTietKiem.length) {
			dsSoTietKiem[soLuongSo] = a;
			soLuongSo++;
			return true;
		} else {
			System.out.println("Không thể thêm . Đã đạt số lượng tối đa.");
			return false;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("KhachHang{maKH='%s', hoTenKH='%s', soLuongSo=%d, dsSoTietKiem=[\n", maKH, hotenKH,
				soLuongSo));
		for (int i = 0; i < soLuongSo; i++) {
			sb.append(String.format("  %s%n", dsSoTietKiem[i].toString()));
		}
		sb.append("]}");
		return sb.toString();
	}

}
