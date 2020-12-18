import java.util.Scanner;

public class java {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		float money;
		int month = 0;
		System.out.print("enter money: ");
		money = s.nextFloat();
		while (money < 1000) {
			money = money + money * (7 / 1000);
			month++;
		}
		System.out.println("money : " + money);
		System.out.println("month : " + month);
	}

}
