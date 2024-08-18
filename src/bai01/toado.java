package bai01;

public class toado {
	// class attributes
	int x, y;
	char name;

	// constructor
	public toado() {

	}

	public toado(char name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	// method
	public String toString() {
		return name + "(" + x + ";" + y + ")";

	}
}
