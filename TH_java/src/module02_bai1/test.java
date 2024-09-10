package module02_bai1;

public class test {

	public static void main(String[] args) {
		HinhChuNhat h1, h2;
		h1 = new HinhChuNhat();
		h2 = new HinhChuNhat(5, 6);
		System.out.println(h1.toString());
		System.out.println(h2.toString());

		System.out.println("--------------------------");
		h1.setDai(10);
		h1.setrong(5);
		System.out.println(h1.toString());
		System.out.println(h2.toString());

	}

}
