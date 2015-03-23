
public class LengthNode {
//	
//	public Tree tree;
//	public ArrayList<TreeNode> list;
//	
//	public LengthNode(){
//		this.tree = new Tree();
//		this.list = new ArrayList<TreeNode>();
//	}
//	/*
//	 * 
//	 */
//	public void update(String str){
//		String sorted = Util.sortString(str);
//		System.out.println("adding string : "+ str + " "+sorted);
//		TreeNode n = new TreeNode(sorted, str);
//		boolean found = tree.update(n);
//		System.out.println(found+"");
//		if(!found){
//			// not in tree, check for list
//			n = retrieveNodeFromList(sorted, str);
//			if(n == null){
//				// not in list
//				list.add(n);
//				System.out.println("added to the list");
//				System.out.println(list.size()+"");
//			}else{
//				tree.add(n); 
//				System.out.println("added to the tree");
//			}
//		}
//	}
//	
//	private TreeNode retrieveNodeFromList(String sorted, String original) {
//		// search in list, if found => update and return 
//		for(int i = 0; i < list.size() ; i++){
//			if(list.get(i).getSorted().equalsIgnoreCase(sorted)){
//				TreeNode n = list.get(i);
//				n.add(original);
//				list.remove(i);
//				return n;
//			}
//		}
//		return null;
//	}
//
//	public String getOriginals() {
//		return tree.getOriginals();
//	}
//	
//	
//	
}
