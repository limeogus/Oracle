package hb.quiz.coffeeshopver4;

public class CoffeeShop {

	public static void main(String[] args) {

		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("CoffeeShop에 오신것을 환영합니다");
		System.out.println("1번 : 아이스 아메리카노(5000원)");
		System.out.println("2번 : 딸기주스(8000원)");
		System.out.println("3번 : 까페 모카(6500원)");
		System.out.println("4번 : 녹차 프라프치노(7000원)");
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
