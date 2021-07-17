import java.io.File;

public class Search {
	
	public void searchFile(String fname) {
		int check = 0;
		File f = new File("C:\\Users\\manoh\\Documents\\JavaFullstack\\phase1-oops\\Company\\files\\");
		
		String fileListe[] = f.list();
		for (String val : fileListe) {
			if(val.equalsIgnoreCase(fname)) {
				check=1;
				System.out.println("File Found \t"+val);
			}
		}
		if(check==0) {
			System.out.println("File not fount");
		}
		
	}

}
