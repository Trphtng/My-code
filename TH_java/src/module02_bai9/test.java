package module02_bai9;

public class test {

	public static void main(String[] args) {

		Khachhang kh = new Khachhang(10);

		Sotietkiem st = new Sotietkiem("MS01", null, 1000000, 12, 5.0f);
		kh.themSoTietKiem(st);

		Sotietkiem[] danhSach = kh.getDsSoTietKiem();
		if (danhSach != null) {
			System.out.println("Số lượng sổ tiết kiệm: " + danhSach.length);
		} else {
			System.out.println("Danh sách sổ tiết kiệm không được khởi tạo.");
		}
	}
}
