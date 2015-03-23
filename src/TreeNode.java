
public class TreeNode {
	private String key;
	private ArrayList<String> value;
	public TreeNode left, right;
	
	public TreeNode(String key, String value){
		this.key = key;
		this.value = new ArrayList<String>();
		this.value.add(value);
		this.left = null;
		this.right = null;
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
