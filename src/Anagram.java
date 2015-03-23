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
				System.out.println("adding "+s);
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
		
		if(str.length() > 1){ // take out single letter word
			Tree current = array[str.length() - 2]; // anagram of string length greater than or equal to 2
			current.add(Util.sortString(str), str);
		}
	}
	
	
	public void output(String filename, int from, int count){
		
		from = from > 1? from - 2 : 0;
		try {
		      PrintStream out = new PrintStream(new FileOutputStream(filename));
		      System.out.println("printing output");
		      for(int i = from; i < size; i++){
		    	  //System.out.println("out length node "+i);
		    	  Tree tree = array[i];
		    	  out.print(tree.toString(count));
		      }
		      out.close();
		      System.out.println("printed output");

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
	}
	
	public void output(String filename){
		output(filename, 2, 0);
	}
	
}
