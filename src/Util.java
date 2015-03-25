import java.util.Arrays;


public class Util {
	public static String sortString(String str){
		char[] c = str.toCharArray();
		//Arrays.sort(c);
		if(str.length() > 1){
			int min;
			char tmp;
			for(int i = 0; i < c.length ; i++){
				min = i;
				for( int j = i+1 ; j < c.length; j++){
					if(c[j] < c[min]) min = j;
				}
				if(min != i){
					tmp = c[min];
					c[min] = c[i];
					c[i] = tmp;
				}
			}
			return new String(c);
		}
		return str;
	}
}
