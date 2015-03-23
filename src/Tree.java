
public class Tree {
	
	private TreeNode root;
	
	public Tree(){
		root = null;
	}
	
	public Tree(TreeNode root){
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}
	
	public void add(String key, String value ){
		this.root = add(this.root, key, value);
	}
	
	public TreeNode add(TreeNode n, String key, String value){
		if( n == null) return new TreeNode(key, value);
		int cmp = key.compareToIgnoreCase(n.getKey());
		if( cmp < 0) n.left = add(n.left, key, value);
		else if(cmp > 0) n.right = add(n.right, key, value);
		else n.add(value);
		return n;
	}
	
	public String toString(){
		return toString(this.root,0);
	}
	
	public String toString(int count){
		return toString(this.root,count);
	}
	
	public String toString(TreeNode n, int count){
		if(n == null) return "";
		
		String output = "";
		if(n.left != null) output += toString(n.left, count);
		output += n.toString(count);
		if(n.right != null) output += toString(n.right, count);
		return output;
		
	}
}
