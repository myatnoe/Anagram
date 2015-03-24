
public class Tree {
	
	private Node root;
	
	public Tree(){
		root = null;
	}
	
	public Tree(Node root){
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}
	
	public void add(String key, String value){
		if(this.root==null) {
			this.root = new Node(key, value);
		}else{
			this.root = insert(this.root, key, value);
		}
	}
	
	public Node add(Node n, String key, String value){
		if( n == null) return new Node(key, value);
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
	
	public String toString(Node n, int count){
		if(n == null) return "";
		
		String output = "";
		if(n.left != null) output += toString(n.left, count);
		output += n.toString(count);
		if(n.right != null) output += toString(n.right, count);
		return output;
		
	}
	
	public int getBalance(Node n){
		if(n != null){
			int x = 0, y = 0;
			if(n.left != null) x = n.left.height;
			if(n.right != null) y = n.right.height;
			return (x-y);
		}
		return 0;
	}
	
	public Node rightRotate(Node n){
		Node y = n.left;
		Node tmp = y.right;
		
		y.right = n;
		n.left = tmp;
		
		// update the height of n
		int a = 0, b = 0;
		if(n.left != null) a = n.left.height;
		if(n.right != null) b = n.right.height;
		n.height = (a > b ? a : b) + 1;
		
		// update the height of y
		a = 0; b = 0;
		if(y.left != null) a = y.left.height;
		if(y.right!= null) b = y.right.height;
		y.height = (a > b ? a : b) + 1;
		
		// y is the root
		return y;
	}
	
	public Node leftRotate(Node n){
		Node y = n.right;
		Node tmp = y.left;
		
		y.left = n;
		n.right = tmp;
		
		// update the height of n
		int a = 0, b = 0;
		if(n.left != null) a = n.left.height;
		if(n.right != null) b = n.right.height;
		n.height = (a > b ? a : b) + 1;
		
		// update the height of y
		a = 0; b = 0;
		if(y.left != null) a = y.left.height;
		if(y.right != null) b = y.right.height;
		y.height = (a > b ? a : b) + 1;
		
		return y;
	}
	
	public Node insert0(Node node, String key, String value){
		if(node == null){
			node = new Node(key, value);
			return node;
		}
		int cmp = key.compareToIgnoreCase(node.getKey());
		if(cmp < 0) node.left = insert0(node.left, key, value);
		else node.right = insert0(node.right, key, value);
		
		int a = 0, b = 0;
		if(node.left != null) a = node.left.height;
		if(node.right != null) b = node.right.height;
		node.height = (a > b ? a : b) + 1;
		
		int balance = getBalance(node);
		
		// left left case
		if(balance > 1 && cmp < 0) return rightRotate(node);
		// right right case
		if(balance < -1 && cmp > 0) return leftRotate(node);
		// left right case
		if(balance > 1 && cmp > 0){
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		// right left case
		if(balance < -1 && cmp < 0){
			node.right = rightRotate(node);
			return leftRotate(node);
		}
		return node;
	}
	
	
	
	private Node insert(Node node, String key, String value){
		int cmp = 0;
		if(node != null) cmp = key.compareTo(node.getKey());
        if (node == null) node = new Node(key, value);
        else if (cmp < 0){
            node.left = insert(node.left, key, value);
            if (height( node.left ) - height( node.right ) == 2)
                if (cmp < 0)
                    node = rotateWithLeftChild( node );
                else
                    node = doubleWithLeftChild( node );
        }
        else if (cmp > 0){
            node.right = insert(node.right, key, value);
            if (height( node.right ) - height( node.left ) == 2)
                if (cmp > 0)
                    node = rotateWithRightChild( node );
                else
                    node = doubleWithRightChild( node );
        }
        else{
        	node.add(value);
        }
        node.height = max( height( node.left ), height( node.right ) ) + 1;
        return node;
    }
	
	/* Rotate binary tree node with left child */     
    private Node rotateWithLeftChild(Node k2)
    {
        Node k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = max( height( k2.left ), height( k2.right ) ) + 1;
        k1.height = max( height( k1.left ), k2.height ) + 1;
        return k1;
    }

    /* Rotate binary tree node with right child */
    private Node rotateWithRightChild(Node k1)
    {
        Node k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max( height( k1.left ), height( k1.right ) ) + 1;
        k2.height = max( height( k2.right ), k1.height ) + 1;
        return k2;
    }
    /**
     * Double rotate binary tree node: first left child
     * with its right child; then node k3 with new left child */
    private Node doubleWithLeftChild(Node k3)
    {
        k3.left = rotateWithRightChild( k3.left );
        return rotateWithLeftChild( k3 );
    }
    /**
     * Double rotate binary tree node: first right child
     * with its left child; then node k1 with new right child */      
    private Node doubleWithRightChild(Node k1){
        k1.right = rotateWithLeftChild( k1.right );
        return rotateWithRightChild( k1 );
    }

	private int height(Node n) {
		return n == null ? -1 : n.height;
	}
	
	private int max(int a, int b){
		return a > b ? a : b;
	}
}
