package module02_bai10;

public class CD {
	// attributes
	private int maCD;
	private String tuaCD;
	private int sobaihat;
	private double giathanh;
	
	//getter setter
	public int getmaCD(){
		return this.maCD;
	}
	public String tuaCD(){
		return this.tuaCD;
	}
	public int getsobaihat() {
		return this.sobaihat;
	}
	public double getgiathanh() {
		return this.giathanh;
	}
	public void setmaCD(int maCD) {
		if(this.maCD > 0)
			this.maCD = maCD;
		else
			{
				this.maCD = 999999;
			}
	}
	public void settuaCD(String tuaCD ) {
		if(this.tuaCD == "")
			this.tuaCD = "chua xac dinh";
		else
		{
			this.tuaCD = tuaCD;
		}
	}
	public void setsobaihat(int sobaihat) {
		if (this.sobaihat>0)
			this.sobaihat = sobaihat;
	}
	public void setgiathanh(double giathanh) {
		if (this.giathanh > 0) {
			this.giathanh = giathanh;
		}
	}
	// constructor
	public CD (){
		this.maCD = 999999;
		this.tuaCD = "chua xac dinh";
		this.sobaihat = 0;
		this.giathanh = 0;
	}
	public CD (int maCD, String tuaCD, int sobaihat, double giathanh) {
		setmaCD(maCD);
		settuaCD(tuaCD);
		setsobaihat(sobaihat);
		setgiathanh(giathanh);
	}
	
	public static String gettieude () {
		return String.format("%5s %-15s %10s %10s", "maCD", "tuaCD", "so bai hat", "gia thanh");
		
	}
	public String toString () {
		return String.format("%5d %-15s %10d %10.2f", maCD, tuaCD,sobaihat,giathanh);
	}
}
