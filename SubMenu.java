import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubMenu {
	public int input(int i) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for adjacent operation");
		System.out.println("1. Display File Name in Ascending Order");
		System.out.println("2. User Interface Options");
		System.out.println("3. Go to Welcome Page");
		System.out.println("4. Exit Application");
		System.out.println(" ");
		try {
			int input = Integer.parseInt(read.readLine());
			if (input == 1) {
				SortFiles sf = new SortFiles();
				sf.ascend();
			}
			else if (input == 2) {
				UInterface ui = new UInterface();
				ui.input(0);
			}
			else if (input == 3) {
				Welcome sp = new Welcome();
				sp.welcome();
				sp.MainMenuOp(0);
			}
			else if (input == 4) {
				System.out.println("Thanks for using LOCKEDME.COM");
				System.out.println(" ");
				System.out.println(" ");
			}
		} catch (IOException e) {
			System.err.println("ERROR!! TRY AGAIN");
			System.out.println(" ");
			System.out.println(" ");
		} finally {
			System.out.println(" ");
			System.out.println(" ");
			SubMenu m = new SubMenu();
			m.input(0);
		}
		return i;
	}
}
