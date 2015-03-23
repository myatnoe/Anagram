import java.io.File;

public class assignment {

	public static void main(String[] args) {
		
		File file1 = new File("dict2");
		Anagram one = new Anagram(file1);
		one.output("./anagram2", 0, 0);
		
		
		//File file2 = new File("dict2");
//		int max = 0;
//		String maxs = "";
//		int count = 0;
//		try {
//			Scanner scanner = new Scanner(file1);
//			while(scanner.hasNext()){
//				String s = scanner.next();
//				System.out.println(s);
//				count++;
//				if(s.length() > max) {
//					max = s.length();
//					maxs = s;
//				}
//			}
//			scanner.close();
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		
//		System.out.println(max);
//		System.out.println(maxs);
//		System.out.println(count);
	}

}
