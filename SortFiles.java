import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

public class SortFiles
{
  @SuppressWarnings({ "unchecked", "rawtypes" })
public void ascend()
  {
    File dir = new File("C:\\");
    if(dir.isDirectory())
    {
      // Fetching the list from the directory
      File[] files = dir.listFiles();
   
   // Creating a filter to return only files.
      FileFilter fileFilter = new FileFilter()
      {
        @Override
        public boolean accept(File file) {
          return !file.isDirectory();
        }
      };
   
   files = dir.listFiles(fileFilter);
   
      // Sort files by name
      Arrays.sort(files, new Comparator()
      {
        @Override
        public int compare(Object f1, Object f2) {
          return ((File) f1).getName().compareTo(((File) f2).getName());
        }
      });

      //Prints the files in file name ascending order
      for(File file:files)
      {
        System.out.println(file.getName());
      }
    }
    System.out.println(" ");
    System.out.println(" ");
    SubMenu m = new SubMenu();
	m.input(0);
  }
}
