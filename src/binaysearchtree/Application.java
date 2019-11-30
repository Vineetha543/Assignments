package binaysearchtree;

public class Application {
	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.insert(2,"two");
		tree.insert(4,"four");
		tree.insert(5,"five");
		tree.insert(8,"eight");
		tree.insert(9,"nine");
		tree.insert(10,"ten");
        tree.insert(17,"seventeen");
		tree.insert(18,"eighteen");
		tree.insert(19,"nineteen");
		tree.insert(20,"twenty");
		tree.insert(21,"twentyone");
		tree.insert(22,"twentytwo");
		tree.insert(24,"tewntyfour");
		tree.insert(33,"thirtythree");
		
		
		
		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
		
		System.out.println(tree.remove(10));
		System.out.println(tree.findMin().key);
		
		tree.displayTree();
		
	
		
		
		

	}
}
