package module02_bai10;

public class test {

	public static void main(String[] args) {
		CD cd1 = new CD(1,"abc",10,50000);
		CD cd2 = new CD(2,"xyzt",10,60000);
		CD cd3 = new CD(3,"Darknight",5,100000);
		
		CDlist cds = new CDlist(5); 
		cds.addCD(cd1);
		cds.addCD(cd2);
		cds.addCD(cd3);
		
		System.out.println(CD.gettieude());
		System.out.println(cds);


	}

}
