package hb.quiz.coffeeshopver4;

import java.util.Scanner;

public class Guest {

	// Field
	int money = 0;
	Scanner scan = new Scanner(System.in);

	// Constructor
	public Guest() {

	}

	public Guest(int money) {
		this.money = money;
	}

	// getter, setter method
	public int getmoney() {
		return money;
	}

	public void setmoney(int money) {
		this.money = money;
	}

	// Method
	public int input() {
		int data = 0;
		System.out.print("Guest : ");
		data = scan.nextInt();
		return data;
	}

	public void pay() {
		System.out.println("Guest : 여기있습니다. " + money + "원 입니다.");
	}

	public void addMoney(int money) {
		this.money += money;
	}

}
