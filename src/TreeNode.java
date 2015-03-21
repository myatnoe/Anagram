
public class TreeNode {
	private String sorted;
	private ArrayList<String> original;
	
	public TreeNode(String sorted, String original){
		this.sorted = sorted;
		this.original = new ArrayList<String>();
		this.original.add(original);
	}

	public void add(String str) {
		// TODO Auto-generated method stub
		
	}
	
	public String getSorted(){
		return sorted;
	}
}
