package bai02;

import java.util.Scanner;

public class play {
	public static void main(String[] args) {

		SinhVien sv1 = new SinhVien(1, "Nguyen Truong Phat", 10, 10);
		SinhVien sv2 = new SinhVien();
		SinhVien sv3 = new SinhVien();

		// input information for sv3
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ma SV: ");
		int maSV = sc.nextInt();
		sv3.setmaSV(maSV);

		sc.nextLine();

		System.out.print("Enter name: ");
		String name = sc.nextLine();
		sv3.setName(name);

		System.out.print("Enter ma DiemLT: ");
		int LT = sc.nextInt();
		sv3.setDiemLT(LT);

		System.out.print("Enter ma DiemTH: ");
		int TH = sc.nextInt();
		sv3.setDiemTH(TH);
		sc.close();

		// format report
		String title = String.format("%-10s %-20s %-10s %-10s %-10s", "masv", "Ho va ten", "DiemTH", "DiemLT",
				"DiemTB");
		System.out.println(title);

		String infor1 = String.format("%-10d %-20s %-10d %-10d %-10.2f", sv1.getMaSV(), sv1.getName(), sv1.getDiemLT(),
				sv1.getDiemTH(), sv1.AverScore());
		System.out.println(infor1);

		String infor2 = String.format("%-10d %-20s %-10d %-10d %-10.2f", sv2.getMaSV(), sv2.getName(), sv2.getDiemLT(),
				sv2.getDiemTH(), sv2.AverScore());
		System.out.println(infor2);

		String infor3 = String.format("%-10d %-20s %-10d %-10d %-10.2f", sv3.getMaSV(), sv3.getName(), sv3.getDiemLT(),
				sv3.getDiemTH(), sv3.AverScore());
		System.out.println(infor3);
	}

}
