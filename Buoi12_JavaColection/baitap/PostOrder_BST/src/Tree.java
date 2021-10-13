public interface Tree<E> {

    public boolean insert(E e);

    public void inorder();

    public int getSize();

    public void postorder();

    public void preorder();
}