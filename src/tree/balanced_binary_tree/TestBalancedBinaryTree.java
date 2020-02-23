package tree.balanced_binary_tree;

public class TestBalancedBinaryTree {

	public static void main(String[] args) {
//		int[] arr = new int[] {8,9,6,7,5,4};
		int[] arr = new int[] {8,9,5,4,6,7};
		//创建一颗二叉排序树
		BalancedBinaryTree bst = new BalancedBinaryTree();
		//循环添加
		for(int i:arr) {
			bst.add(new Node(i));
		}
		//查看高度
		System.out.println(bst.root.height());
		//
		System.out.println(bst.root.value);
	}

}
