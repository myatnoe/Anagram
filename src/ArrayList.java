
public class ArrayList<T> {
	private T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
	public ArrayList(){
		array = (T[]) new Object[1000];
		size = 0;
	}
	
	public void add(T item){
		if(size >= array.length){
			expendArray();
		}
		array[size++] = item;
	}

	
	private void expendArray(){
		
	}

	public int getIndex(int index) {
		// TODO Auto-generated method stub 
		return 0;
	}
	
	public int size(){
		return size;
	}

	public TreeNode get(int i) { 
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(int i) { 
		// TODO Auto-generated method stub
	}

}
