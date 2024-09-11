package module02_bai10;

import java.awt.List;

public class CDlist {
	private CD [] list;
	private int count = 0;
	
	// constructor
	public CDlist (int n) {
		list = new CD[n];
		count = 0;
		
	}
	public boolean addCD (CD cd) {
		if (count < list.length) {
			list[count++] = cd;
			return true;
		}
		else 
		{
			return false;
		}
	}
	public int soluongCD () {
		int soluong = 0;
		for (int i = 0 ;i < count;i++) {
			soluong++;
		}
		return soluong;
	}
	public double tonggiathanh() {
		double tong=0;
		for (int i =0;i<count;i++) {
			tong+= list[i].getgiathanh();
		}
		return tong;
	}
	public String toString() {
		String s = "";
		for(int i=0; i<count; i++)
			s+=list[i].toString() + "\n";
		return s;
	}
	public void findmaCD(int maCD) {
		for(int i=0; i<count; i++){
			if (list[i].getmaCD() == maCD) {
				System.out.println("CD can tim la: " + list[i].toString());
				return;
			}
		}
		return;
		
	}
	public void sortgiathanh() {
		for(int i=0; i<count; i++) {
			for(int j=0; j<count; j++) {
				if (list[i].getgiathanh()>list[j].getgiathanh()) {
					CD temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		return;
	}
}
