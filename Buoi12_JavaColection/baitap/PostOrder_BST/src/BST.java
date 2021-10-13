public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }
    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void inorder() {
        inorder(root);
    }
    @Override
    public void postorder(){
        postorder(root);
    }
    @Override
    public void preorder(){
        preorder(root);
    }
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    protected void postorder(TreeNode<E> root){
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
    protected void preorder(TreeNode<E> root){
        if(root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public boolean findtree(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }
    public void deletetree(E e){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
                parent = current;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else{
                if(e.compareTo(parent.element) > 0){
                    if(current.left == null){
                        parent.right = current.right;
                        size--;
                        current = null;
                    }
                    else if(current.right == null){
                        parent.right = current.left;
                        size--;
                        current = null;
                    }
                }
                else if(e.compareTo(parent.element) < 0){
                    if(current.left == null){
                        parent.left = current.right;
                        size--;
                        current = null;
                    }
                    else if(current.right == null){
                        parent.left = current.left;
                        size--;
                        current = null;
                    }
                }
            }
        }
    }

}