public class TreeNode {
   
   private int data;
   private TreeNode left;
   private TreeNode right;

   public TreeNode(int value) {
      this.data = value;
      this.left = this.right = null;
   }

   public int getData() {
      return data;
   }

   public TreeNode getLeft() {
      return left;
   }

   public TreeNode getRight() {
      return right;
   }

   public void setData(int data) {
      this.data = data;
   }

   public void setLeft(TreeNode left) {
      this.left = left;
   }

   public void setRight(TreeNode right) {
      this.right = right;
   }

   @Override
   public String toString() {
      return String.format("%d", getData());
   }

   public void insert(int value) {
      if (value == data)
         return;
      if (value < data) {
         if (left == null) {
            left = new TreeNode(value);
         }
         else {
            left.insert(value);
         }
      }
      else {
         if (right == null) {
            right = new TreeNode(value);
         }
         else {
            right.insert(value);
         }
      }
   }

   public void preorder() {
      System.out.print(data + ", ");
      if (left != null) left.preorder();
      if (right != null) right.preorder();
   }

   public void inorder() {
      if (left != null) left.inorder();
      System.out.print(data + ", ");
      if (right != null) right.inorder();
   }

   public void postorder() {
      if (left != null) left.postorder();
      if (right != null) right.postorder();
      System.out.print(data + ", ");
   }



}
