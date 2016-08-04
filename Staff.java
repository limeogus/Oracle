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
		System.out.println("Staff : �ֹ��Ͻðڽ��ϱ�?(��ȣ�Է�)");
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
			menu = "���̽� �Ƹ޸�ī��";
			price = 5000;
			break;
		case 2:
			menu = "�����ֽ�";
			price = 8000;
			break;
		case 3:
			menu = "���� ��ī";
			price = 6500;
			break;
		case 4:
			menu = "���� ������ġ��";
			price = 7000;
			break;
		default:
			menu = "";
			price = 0;
		}
	}

	public void menuConfirm() {
		System.out.println("Staff : �ֹ��Ͻ� �޴��� " + menu + " �½��ϱ�?(������1,�ٽü��� 2)");
	}

	/*
	 * public void menuAdd(){ menuList[count]=menu; count++; }
	 * 
	 * public void printMenu(){ for(int i=0; i<count; i++){
	 * System.out.println(menuList[i]); } }
	 */
	public void reSelect() {
		System.out.println("Staff : �޴��� �ٽ� ������ �ּ���");
	}

	public void calculate() {
		System.out.println("Staff : �ݾ��� " + price + " �Դϴ�.");
	}

	public void moneyCheck(int money) {

		if (price == money) {
			System.out.println("Staff : �ݾ��� ��Ȯ�մϴ�");

		} else if (price < money) {
			int change = money - price;
			System.out.println("Staff : �Ž�����" + change + " �Դϴ�");

		} else if (price > money) {
			System.out.println("Staff : ���� �����մϴ�");
		}
	}

	public void finalComment() {
		System.out.println("Staff : �ֹ��� �Ϸ�Ǿ����ϴ�.");
	}
	/*
	public void reAsk() {
		System.out.println("Staff : �� �ֹ��Ͻðڽ��ϱ�?");
	}
	*/

}
