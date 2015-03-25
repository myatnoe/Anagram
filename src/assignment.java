import java.io.File;

public class Assignment {

	public static void main(String[] args) {
		
		try{
			long startTime = System.currentTimeMillis();
			File file1 = new File("/courses/cs300/cs311/cs311/dict1");
			//File file1 = new File("dict1");
			Anagram one = new Anagram(file1);
			one.output("./anagram1", 0, 6);
			long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println(totalTime);
			
			startTime = System.currentTimeMillis();
			File file2 = new File("/courses/cs300/cs311/cs311/dict2");
			//File file2 = new File("dict2");
			Anagram two = new Anagram(file2);
			two.output("./anagram2", 0,0); 
			endTime   = System.currentTimeMillis();
			totalTime = endTime - startTime;
			System.out.println(totalTime);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
