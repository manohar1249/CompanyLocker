//import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
	
	public void callAddfile(String name,String data) {
		AddFile ad = new AddFile();
		
		ad.addFile(name,data);
	}
	private void callDeleteFile(String fname) {
		// TODO Auto-generated method stub
		DeleteFile d = new DeleteFile();
		d.deleteFile(fname);
		
	}
	private void callSearchFile(String fname) {
		// TODO Auto-generated method stub
		Search s = new Search();
		s.searchFile(fname);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		//AddFile ad = new AddFile();
		Main m = new Main();
		Scanner s = new Scanner(System.in);
		
		String ch = "yes";
		
		while(ch.contentEquals("yes")) {
			String choice,fname;
			System.out.println("enter your choice \n add:to add files \n search: to search the files \n delete: for deleting files");
			choice = s.next();
			switch(choice) {
			case "add":
				System.out.println("enter file name");
				 fname= s.next();
				System.out.println("enter date");
				String data = s.next();
				m.callAddfile(fname,data);
				break;
			case "delete":
				System.out.println("enter file name");
				fname= s.next();
				m.callDeleteFile(fname);
				break;
			case "search":
				System.out.println("enter file name");
				fname= s.next();
				//file found based on complete name includes extension
				
				m.callSearchFile(fname);
				break;
				
			default :
				System.out.println("Enter correct choice");
				break;
			}
			
			System.out.println("enter choice between yes or no");
			ch = s.next();
			System.out.println(ch);
			
			
			
		}
		
		s.close();
	}

	

}
