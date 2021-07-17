import java.io.File;

public class DeleteFile {

	public void deleteFile(String fname) {
		
		File f = new File("C:\\Users\\manoh\\Documents\\JavaFullstack\\phase1-oops\\Company\\files\\"+fname);
		
		if(f.delete()) {
			System.out.println("file \t"+fname+"\t was deleted.");
		}
		else {
			System.out.println("file not found");
		}
	}
}
