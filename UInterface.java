import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UInterface {
	public int input(int i) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for adjacent operation");
		System.out.println("1. Add File");
		System.out.println("2. Delete File");
		System.out.println("3. Search File");
		System.out.println("4. Go To Main Menu");
		System.out.println("5. Exit Application");
		System.out.println(" ");
		try {
			int input = Integer.parseInt(read.readLine());
			if (input == 1) {
				AddF add = new AddF();
				add.CreateFile();
			}
			else if (input == 2) {
				DeleteF del = new DeleteF();
				del.delete();
			}
			else if (input == 3) {
				FindFile search = new FindFile();
				search.search();
			}
			else if (input == 4) {
				SubMenu m = new SubMenu();
				m.input(0);
			}
			else if (input == 5) {
				System.out.println("Thanks for using LOCKEDME.COM"); 
				System.out.println(" ");
				System.out.println(" ");
			}
		} catch (IOException e) {
			System.err.println("Not a valid input");
			System.out.println(" ");
			System.out.println(" ");
			UInterface ui = new UInterface();
			ui.input(0);
		}
		return i;
	}
}
