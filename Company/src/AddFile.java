import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.Scanner;

public class AddFile {
	
public void addFile(String fname,String data) {
	String fname1 =fname;
	
	FileOutputStream fs = null;
	
	try {
		File f = new File("C:\\Users\\manoh\\Documents\\JavaFullstack\\phase1-oops\\Company\\files\\");
		int check =1;
		String fileListe[] = f.list();
		for (String val : fileListe) {
			//System.out.println("val");
			if(val.equalsIgnoreCase(fname)) {
				check=0;
				System.out.println("File Found \t"+val);
				break;
				
			}
		}
		if(check==0) {
			System.out.println("File alredy exists please provide other name or extension!!!!");
		}
		else {
		fs = new FileOutputStream("C:\\Users\\manoh\\Documents\\JavaFullstack\\phase1-oops\\Company\\files\\"+fname);
		//System.out.println("enter data for file");
		String data1 = data;
		byte b[] = data1.getBytes();
		fs.write(b);
		fs.close();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
}
