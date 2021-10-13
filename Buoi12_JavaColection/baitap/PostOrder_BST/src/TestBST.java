public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("7");
        tree.insert("4");
        tree.insert("13");
        tree.insert("3");
        tree.insert("5");
        tree.insert("8");
        tree.insert("9");
        tree.insert("11");

        tree.deletetree("8");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}