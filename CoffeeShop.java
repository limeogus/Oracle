package hb.quiz.coffeeshopver4;

public class CoffeeShop {

	public static void main(String[] args) {

		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("CoffeeShop�� ���Ű��� ȯ���մϴ�");
		System.out.println("1�� : ���̽� �Ƹ޸�ī��(5000��)");
		System.out.println("2�� : �����ֽ�(8000��)");
		System.out.println("3�� : ���� ��ī(6500��)");
		System.out.println("4�� : ���� ������ġ��(7000��)");
		System.out.println("+++++++++++++++++++++++++++++++");
		
		Guest lim = new Guest(5000);
		Staff staff = new Staff();
		boolean flag = true;
		lim.addMoney(5000);

		while (flag) {
			int choiceMenu = lim.input();

			staff.selectMenu(choiceMenu);
			staff.menuConfirm();

			if (lim.input() == 1) {
				staff.calculate();
				flag = false;
			} else {
				staff.reSelect();
				//staff.menuAdd();
				flag = true;
			}
		}

		//staff.printMenu();
		lim.pay();
		staff.moneyCheck(lim.money);
		staff.finalComment();

	}
}
