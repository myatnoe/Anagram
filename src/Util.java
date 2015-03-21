import java.util.Arrays;


public class Util {
	public static String sortString(String str){
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
}
