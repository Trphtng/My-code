package module02_bai2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		SinhVien sv1, sv2, sv3;
		sv1 = new SinhVien(1, "Nguyen Truong Phat", 10, 10);

		sv2 = new SinhVien();
		sv2.setmasv(2);
		sv2.sethoten("Nguyen Thi Tuyet Vy");
		sv2.setdiemlt(10);
		sv2.setdiemth(10);

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma sv cua sv3: ");
		int masv3 = sc.nextInt();
		System.out.println("Nhap vao ho ten cua sv3: ");
		String hotensv3 = sc.nextLine();
		System.out.println("Nhap vao diem LT cua sv3: ");
		float diemlt = sc.nextFloat();
		System.out.println("Nhap vao diem TH cua sv3: ");
		float diemth = sc.nextFloat();
		sc.close();
		sv3 = new SinhVien(masv3, hotensv3, diemlt, diemth);

		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
	}

}
