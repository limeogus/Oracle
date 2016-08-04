package hb.quiz.coffeeshopver4;

public class Staff {
	// Field
	String menu = "";
	int price = 5000;
	int count = 0;
	String[] menuList = new String[4];

	// Constructor
	public String[] getmenuList() {
		return menuList;
	}

	public void setmenuList(String[] menuList) {
		this.menuList = menuList;
	}

	public Staff() {
		System.out.println("Staff : 주문하시겠습니까?(번호입력)");
	}

	// getter, setter method
	public String getmenu() {
		return menu;
	}

	public void setmenu(String menu) {
		this.menu = menu;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	// Method
	public void selectMenu(int choiceMenu) {

		switch (choiceMenu) {
		case 1:
			menu = "아이스 아메리카노";
			price = 5000;
			break;
		case 2:
			menu = "딸기주스";
			price = 8000;
			break;
		case 3:
			menu = "까페 모카";
			price = 6500;
			break;
		case 4:
			menu = "녹차 프라프치노";
			price = 7000;
			break;
		default:
			menu = "";
			price = 0;
		}
	}

	public void menuConfirm() {
		System.out.println("Staff : 주문하신 메뉴가 " + menu + " 맞습니까?(맞으면1,다시선택 2)");
	}

	/*
	 * public void menuAdd(){ menuList[count]=menu; count++; }
	 * 
	 * public void printMenu(){ for(int i=0; i<count; i++){
	 * System.out.println(menuList[i]); } }
	 */
	public void reSelect() {
		System.out.println("Staff : 메뉴를 다시 선택해 주세요");
	}

	public void calculate() {
		System.out.println("Staff : 금액이 " + price + " 입니다.");
	}

	public void moneyCheck(int money) {

		if (price == money) {
			System.out.println("Staff : 금액이 정확합니다");

		} else if (price < money) {
			int change = money - price;
			System.out.println("Staff : 거스름돈" + change + " 입니다");

		} else if (price > money) {
			System.out.println("Staff : 돈이 부족합니다");
		}
	}

	public void finalComment() {
		System.out.println("Staff : 주문이 완료되었습니다.");
	}
	/*
	public void reAsk() {
		System.out.println("Staff : 더 주문하시겠습니까?");
	}
	*/

}
