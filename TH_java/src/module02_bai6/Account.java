package module02_bai6;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	// attributes
	private long accountNumber;
	private String name;
	private double balance;
	private double RATE = 0.035;

	// constructor
	public Account() {
		this.accountNumber = 999999;
		this.name = "chua xac dinh";
		this.balance = 50000;

	}

	public Account(long accNumber, String name, double balance) {
		this();
		if (accNumber > 0 && name != "" && balance >= 50000) {
			this.accountNumber = accNumber;
			this.name = name;
			this.balance = balance;
		}

	}

	public Account(long accNumber, String name) {
		this();
		if (accNumber > 0 && name != "" && balance >= 50000) {
			this.accountNumber = accNumber;
			this.name = name;
		}
	}

	// property getter
	public long getAccountNumber() {
		return this.accountNumber;
	}

	public double getbalance() {
		return this.balance;
	}

	// others methods
	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean withdraw(double amount, double fee) {
		if (amount > 0 && amount + fee <= balance) {
			balance -= (amount + fee);
			return true;
		} else {
			return false;
		}
	}

	public void addInterest() {
		balance = balance + balance * RATE;
	}

	public boolean transfer(Account acc2, double amount) {
		if (amount > 0 && this.balance > amount) {
			this.balance -= amount;
			acc2.balance += amount;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		Locale local = new Locale("vi", "VN");

		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

		String formattedBalance = formatter.format(balance);

		return "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + formattedBalance;
	}

}
