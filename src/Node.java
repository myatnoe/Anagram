
public class Node {
	private String key;
	private ArrayList<String> value;
	public Node left, right;
	public int height;
	
	public Node(String key, String value){
		this.key = key;
		this.value = new ArrayList<String>();
		this.value.add(value);
		this.left = null;
		this.right = null;
		this.height = 1;
	}

	public void add(String str) {
		value.add(str);
	}
	
	public String getKey(){
		return key;
	}
	
	public ArrayList<String> getValue(){
		return value;
	}
	
	public String toString(int count){
		if(value.size() >= count)
			return value.toString();
		return "";
	}
	
	public String toString(){
		return toString(0);
	}

}
