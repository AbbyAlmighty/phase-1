import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class DeleteF {
	public void delete()
	{
		Scanner sc=new Scanner(System.in);          
		System.out.print("Enter the file name with complete location: ");  
		String name=sc.nextLine(); 
	        try
	        {
	            Files.deleteIfExists(Paths.get(name));
	        }
	        catch(NoSuchFileException e)
	        {
	            System.out.println("No such file/directory exists");
	        }
	        catch(DirectoryNotEmptyException e)
	        {
	            System.out.println("Directory is not empty.");
	        }
	        catch(IOException e)
	        {
	            System.err.println("Invalid permissions.");
	            System.out.println(" ");
	            System.out.println(" ");
	            UInterface ui = new UInterface();
				ui.input(0);
	        }
	        sc.close();
	        System.out.println("Deletion successful.");
	        System.out.println(" ");
	        System.out.println(" ");
	        UInterface ui = new UInterface();
			ui.input(0);
	}
}
