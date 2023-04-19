public class Tree {

   private TreeNode root;

   public Tree() {
      root = null;
   }

   public TreeNode getRoot() {
      return root;
   }

   public void insert(int value) {
      if (root == null) {
         root = new TreeNode(value);
      } else {
         root.insert(value);
      }
   }

   public void traversePreOrder() {
      if (root != null) {
         root.preorder();
      } 
   }

   public void traverseInOrder() {
      if (root != null) {
         root.inorder();
      } 
   }

   public void traversePostOrder() {
      if (root != null) {
         root.postorder();
      } 
   }

   private int height(TreeNode root) {
      if (root == null)
         return 0;
      else {
         int lheight = height(root.getLeft());
         int rheight = height(root.getRight());
         if (lheight > rheight)
            return lheight + 1;
         else 
            return rheight + 1;
      }
   }

   private void printCurrentLevel(TreeNode root, int level) {
      if (root == null) 
         return;
      else if (level == 1) 
         System.out.print(root.getData() + ", ");
      else {
         printCurrentLevel(root.getLeft(), level-1);
         printCurrentLevel(root.getRight(), level-1);
      }
   }

   public void traverseLevelOrder() {
      int h = height(root);
      for (int i = 1; i <= h; i++) {
         printCurrentLevel(root, i);
      }
   }

   public int minValue() {
      if (root != null) 
         return root.min();
      return -1; // jika tree nya empty
   }

   public int maxValue() {
      if (root != null) 
         return root.max();
      return -1; // jika tree nya empty
   }

}
