package binaysearchtree;

public class Application {
	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.insert(10,"ten");
		tree.insert(30,"thirty");
		
		
		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
		
		System.out.println(tree.remove(10));
		System.out.println(tree.findMin().key);
		
	
		
		
		

	}
}
