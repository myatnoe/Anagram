//
//public class List {
//	private LengthNode[] nodes;
//	private int size;
//	
//	public List(int size){
//		this.nodes = new LengthNode[size];
//		this.size = size;
//		initializeNodeArray();
//	}
//	
//	private void initializeNodeArray(){
//		for(int i = 0; i < nodes.length; i++){
//			nodes[i] = null;
//		}
//	}
//	
//	public void add(String str){
//	
//		if(str.length() > 1){ // take out single letter word
//			LengthNode current = nodes[str.length() -2]; // anagram of string length greater than or equal to 2
//			if(current == null) current = new LengthNode();
//			current.update(str);
//		}
//	}
//	
//	public LengthNode getNode(int i){
//		return nodes[i];
//	}
//	
//	public int size(){
//		return this.size;
//	}
//
//}
