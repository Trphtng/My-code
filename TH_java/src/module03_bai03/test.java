package module03_bai03;

import java.time.LocalDate;

public class test {

	public static void main(String[] args) {
		GiaoDich [] listGD = new GiaoDich[6];
		
		listGD[0] = new GiaoDichVang("001",LocalDate.now(), 4500, 5,"24K");
		listGD[1] = new GiaoDichVang("002",LocalDate.now(), 4500, 5,"24K");
		listGD[2] = new GiaoDichVang("003",LocalDate.now(), 3800, 10,"18K");
		listGD[3] = new GiaoDichTienTe("TT1",LocalDate.now(), 2800, 100,"USD",1.1);
		listGD[4] = new GiaoDichTienTe("TT2",LocalDate.now(), 2800, 500,"USD",1.1);
		listGD[5] = new GiaoDichTienTe("TT3",LocalDate.now(), 1000, 100,"Yen",1.2);
		double sum = 0;
		for(GiaoDich GD: listGD) {
			
			sum+=GD.ThanhTien();
		}
		System.out.println("Gia tri Tb thanh tien cac GD: " + sum/6);
		for(GiaoDich GD: listGD) {
			System.out.println(GD.toString());
		}
	}

}
