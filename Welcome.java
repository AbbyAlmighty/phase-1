import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
	void welcome() {
	System.out.println("Welcome to LOCKEDME.COM");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Developed by - Abhishek Tiwari");
	System.out.println(" ");
	System.out.println(" ");
	}
	public int MainMenuOp(int m) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1 for Menu Options");
		System.out.println("Enter 2 to Exit Application");
		System.out.println(" ");
		try {
			int input = Integer.parseInt(br.readLine());
			if (input == 1) {
				SubMenu sm = new SubMenu();
				sm.input(0);
			} 
			else if (input == 2) {
				System.out.println("Thanks for using LOCKEDME.COM");
				System.out.println(" ");
				System.out.println(" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			Welcome sp = new Welcome();
			sp.welcome();
			sp.MainMenuOp(0);
		}
		return m;
	}
	public static void main(String[] args) {
		Welcome sp = new Welcome();
		sp.welcome();
		sp.MainMenuOp(0);
	}
}