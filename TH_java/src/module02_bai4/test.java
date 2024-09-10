package module02_bai4;

public class test {

	public static void main(String[] args) {
		ThongTinDangKyXe[] xe = new ThongTinDangKyXe[3];
		xe[0] = new ThongTinDangKyXe("Nguyen Truong Phat", "BMW", 1000, 500);
		xe[1] = new ThongTinDangKyXe("Nguyen Van A", "ferari", 1000, 300);
		xe[2] = new ThongTinDangKyXe("Nguyen Minh B", "Bugatti", 2000, 500);
		String header = String.format("%-25s %-15s %-10s %-15s %-15s", "Tên chủ xe", "Loại xe", "Trị giá", "Dung tích",
				"Thuế phải nộp");
		System.out.println(header);
		System.out.println(xe[0].toString());
		System.out.println(xe[1].toString());
		System.out.println(xe[2].toString());

	}

}
