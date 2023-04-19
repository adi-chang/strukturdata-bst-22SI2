public class Demo {

   public static void main(String[] args) {
      
      int[] arr = {25, 20, 22, 15, 17, 27, 30, 26, 32, 29};

      System.out.println("banyak elemen data: " + arr.length);
      System.out.println("data: ");
      for (int x : arr) {
         System.out.print(x + ", ");
      }
      System.out.println();

      // create sebuah BST 
      System.out.println("create a BST.");
      Tree bst = new Tree();
      
      for (int x : arr) {
         System.out.println(String.format("insert item: %2d ke dalam BST", x));
         bst.insert(x);
      }

      // lakukan tree traversal

      // preorder
      System.out.print("preorder: ");
      bst.traversePreOrder();
      System.out.println();

      // inorder
      System.out.print("inorder: ");
      bst.traverseInOrder();
      System.out.println();

      // postorder
      System.out.print("postorder: ");
      bst.traversePostOrder();
      System.out.println();

      // levelorder
      System.out.print("levelorder: ");
      bst.traverseLevelOrder();
      System.out.println();

      // apa data root ? 
      System.out.println("root elemen: " + bst.getRoot());
      // apa data terkecil ? 
      System.out.println("minimum value: " + bst.minValue());
      // apa data terbesar ? 
      System.out.println("maximum value: " + bst.maxValue());


   }
   
}
