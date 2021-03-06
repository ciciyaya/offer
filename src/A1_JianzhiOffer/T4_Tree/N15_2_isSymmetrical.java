package A1_JianzhiOffer.T4_Tree;

public class N15_2_isSymmetrical {

	//给定一个二叉树，检查它是否是自己的镜像
	public boolean isSymmetric(TreeNode root){
		if(root == null)
			return true;
		return isMirror(root.left, root.right);
	}

	boolean isMirror(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return true;
		if(left != null && right != null)
			return (left.val == right.val) && isMirror(left.right, right.left) && isMirror(left.left, right.right);
		return false;
	}

}
