import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Anagram {
	
	private Tree[] array;
	
	private int size = 100;

	public Anagram(File file){
		this.array = new Tree[size];
		initializeNodeArray();
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				String s = scanner.next();
				add(s);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	private void initializeNodeArray(){
		for(int i = 0; i < array.length; i++){
			array[i] = new Tree();
		}
	}
	
	public void add(String str){
		Tree current = array[str.length() - 1]; 
		current.insert(Util.sortString(str), str);
	}
	
	public void output(String filename, int from, int count){
		from = from <= 0? 0 : from - 1;
		try {
		      PrintStream out = new PrintStream(new FileOutputStream(filename));
		      for(int i = from; i < size; i++){
		    	  Tree tree = array[i];
		    	  out.print(tree.toString(count));
		      }
		      out.close();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
	}
	
	public void output(String filename){
		output(filename, 0, 0);
	}
	
}
