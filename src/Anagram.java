import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Anagram {
	
	private List list;

	public Anagram(File file){
		this.list = new List(100);
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				String s = scanner.next();
				System.out.println(s);
				this.list.add(s);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public void output(String filename){
		
	}
	
	public void output(String filename, int lower, int upper){
		
	}
	
	public void output(){
		
	}
	
}
