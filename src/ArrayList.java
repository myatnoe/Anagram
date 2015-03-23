
public class ArrayList<T> {
	private T[] array;
	private int size;
	private int default_size = 1000;
	
	@SuppressWarnings("unchecked")
	public ArrayList(){
		array = (T[]) new Object[default_size];
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList(int length){
		array = (T[]) new Object[length];
		size = 0;
	}
	
	public void add(T item){
		
		array[size++] = item;
		if(size == array.length){
			expendArray();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void expendArray(){
		T[] newarray = (T[]) new Object[size*2];
		for(int i =0; i<size;i++){
			newarray[i] = this.array[i];
		}
		this.array = newarray;
	}

	public int size(){
		return size;
	}

	public T get(int i) { 
		if(i < this.size) return array[i];
		return null;
	}

	public void remove(int index) { 
		for(int i = index; i < size-1; i++){
			array[i] = array[i+1];
		}
		array[size--] = null;
	}
	
	public String toString(){
		String output = "";
		for(int i = 0; i < size; i++){
			output += array[i].toString();
			if(i+1 != size()) output+= ",";
			else output += "\n";
		}
		
		return output;
	}

}
