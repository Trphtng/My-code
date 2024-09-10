package module02_bai5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class HangThucPham {
	// attributes
	private String mahang;
	private String tenhang;
	private int dongia;
	private LocalDate NSX;
	private LocalDate NHH;

	// method getter setter
	public void setmahang(String maHang) {
		if (!maHang.trim().equals(""))
			this.mahang = maHang;
		else
			this.mahang = "###";
	}

	public void settenhang(String tenhang) {
		if ((tenhang == null) || (tenhang.length() == 0))
			this.tenhang = "xxx";
		else
			this.tenhang = tenhang;
	}

	public void setdongia(int dongia) {
		if (dongia >= 0)
			this.dongia = dongia;
		else
			this.dongia = 0;
	}

	public void setNSX(LocalDate NSX) {
		if (NSX.isBefore(LocalDate.now()))
			this.NSX = NSX;
		else
			this.NSX = LocalDate.now();
	}

	public void setNHH(LocalDate NHH) {
		if (NHH.isAfter(NSX))
			this.NHH = NHH;
		else
			this.NHH = this.NSX;
	}

	public String getmahang() {
		return this.mahang;
	}

	public String gettenhang() {
		return this.tenhang;
	}

	public int getdongia() {
		return this.dongia;
	}

	public LocalDate getNSX() {
		return this.NSX;
	}

	public LocalDate getHH() {
		return this.NHH;
	}

	// constructor
	public HangThucPham(String mahang) throws Exception {
		setmahang(mahang);
	}

	public HangThucPham(String mahang, String tenhang, int dongia, LocalDate NSX, LocalDate NHH) {
		setmahang(mahang);
		settenhang(tenhang);
		setdongia(dongia);
		setNHH(NHH);
		setNSX(NSX);
		if (NHH == null || NSX == null) {
			throw new IllegalArgumentException("Ngày sản xuất và ngày hết hạn không được null.");
		}
	}

	// methods
	public boolean hethan() {
		return NHH.isBefore(LocalDate.now()) ? true : false;

	}

	public String toString() {
		if (NSX == null || NHH == null) {
			return "Thông tin không đầy đủ";
		}
		DecimalFormat df = new DecimalFormat("#,###.00");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String trangThai = hethan() ? "chưa hết hạn" : "hết hạn";

		return mahang + "\t" + tenhang + "\t" + df.format(dongia) + "\t" + sdf.format(NSX) + "\t" + sdf.format(NHH)
				+ "\t" + trangThai;
	}
}
